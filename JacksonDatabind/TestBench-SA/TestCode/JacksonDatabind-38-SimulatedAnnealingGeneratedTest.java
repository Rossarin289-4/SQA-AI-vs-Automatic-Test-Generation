package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", "java.lang.Class", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", "java.lang.Object", "<s:m>ey>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "_narrow", "java.lang.Class", "<sample:2>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=...#688#156947521", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"withContentTypeHandler", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"withStaticTyping", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null] -> [simple type, class java.lang.Object]] {getErasedSigna...#607#-942389413", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null] -> [simple type, class java.lang.Object]] {getErasedSigna...#607#-942389413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "forcedNarrowBy", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withTypeHandler", "java.lang.Object", "<i:1>"}}), new String[][]{{"isThrowable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains nu...#671#2095864254", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:5>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:4>", "<sample:0>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.List, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type; class generated.algorithm.SearchInputFactory_s...#658#902413423", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, null -> null] {getErasedSignature=Ljava/util/Map;, getGenericSignature=!NullPointerException, getTypeName=[map type; class java.util.Map, null -> null], hasGenericTypes...#447#1785566963", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<s:a0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:key>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:ym\tx>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.MapType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:6>", "<sample:4>", "<null>", "<sample:3>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, class generated.algorithm.SearchInputFactory_scaf...#643#2116781151", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "hasValueHandler", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.MapType", "findTypeParameters", "java.lang.Class", "<sample:6>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:3>e]>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>", "<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withStaticTyping", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "isInterface", ""}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "1"}, {"hasRawClass", "java.lang.Class", "7"}, {"withStaticTyping", "", "1"}, {"getContentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#433#-1882083284", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isConcrete", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "containedType", "int", "2147483647"}, {"com.fasterxml.jackson.databind.type.MapType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withContentValueHandler", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null] -> [simple type, class java.lang.Object]] {getErasedSigna...#607#-942389413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", "java.lang.Class", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class [Ljava.lang.String;]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, null -> null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[map type; class java.lang.Object, null -> null], hasGen...#457#-166972161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:\">"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFact...#652#855874669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<n...#629#-2019782418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", "java.lang.Object", "<s:l>ey>"}}, 3), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=...#688#156947521", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", "java.lang.Object", "<s:m>\rey>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "_narrow", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", ""}}, 2), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=...#688#156947521", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isContainerType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algorithm.SearchInputFactory_scaffolding$Generic...#205#-356198996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFact...#652#855874669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<n...#629#-2019782418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", "java.lang.Object", "<s:key>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", "java.lang.Object", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Collection", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getContentTypeHandler", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedType", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:0>"}}, 3), new String[][]{{"isContainerType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "containedTypeOrUnknown", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:E]>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:E]>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:ci>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:ci>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:ch>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:ch>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<d:1.4000000000000001>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<d:30.8>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<i:-32768>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<d:15.4>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:aa>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#592#-1744841854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<s:Eaa>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<i:-13>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/String;, getGen...#576#-1761939577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<s:`A:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:a2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<s:`A>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<s:`A>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findSuperType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFact...#652#855874669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>,generated.alg...#249#19563560", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algo...#266#-1856576551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "toCanonical", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>,generated.alg...#249#19563560", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "toCanonical", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.MapType", "getContentTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algo...#266#-1856576551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "toCanonical", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#751#216832731", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false), new String[][]{{"getContentTypeHandler", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false), new String[][]{{"getContentTypeHandler", "", "0"}, {"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false), new String[][]{{"getContentTypeHandler", "", "0"}, {"isArrayType", "", "4"}, {"toCanonical", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>,generated.alg...#249#19563560", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFact...#652#855874669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "isArrayType", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<n...#629#-2019782418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/String;, getGen...#576#-1761939577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/String;, getGen...#576#-1761939577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isFinal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isAbstract", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:6>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algo...#249#-2090834044", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<java.lang.Object>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isContainerType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getKeyType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSign...#569#-1148402317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"getTypeHandler", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-27>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", "int", "2147483647"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isCollectionLikeType", ""}, {"com.fasterxml.jackson.databind.type.MapType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:7>", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedType", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.MapType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "hasRawClass", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}}), new String[][]{{"isThrowable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "forcedNarrowBy", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}}), new String[][]{{"isThrowable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "forcedNarrowBy", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withTypeHandler", "java.lang.Object", "<i:1>"}}), new String[][]{{"isThrowable", "", "4"}, {"containedTypeName", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$...#677#-269791780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}}), new String[][]{{"isThrowable", "", "4"}, {"containedTypeName", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<null>] -> null] {...#621#-1875815813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isJavaLangObject", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isJavaLangObject", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", "int", "10"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", "int", "2"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#643#176010036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isAbstract", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false), new String[][]{{"useStaticType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedType", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:5>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getRawClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:ea>"}, false), new String[][]{{"isJavaLangObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:da>"}, false), new String[][]{{"findSuperType", "java.lang.Class", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:dT>"}, false), new String[][]{{"withContentValueHandler", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "isPrimitive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:E>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Lge...#644#-323617128", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.MapType", "isConcrete", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false), new String[][]{{"insert", "int,java.lang.CharSequence", "3"}, {"insert", "int,float", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "4"}, {"isCollectionLikeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findTypeParameters", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.MapType", "isMapLikeType", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hasGenericTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "buildCanonicalName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null] -> [simple type, class java.lang.Object]] {getErasedSigna...#607#-942389413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hasValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type; class generated.algorithm.SearchInputFactory...#662#-664917283", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isTrueMapType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hasValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isMapLikeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<null...#623#-1251533464", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isConcrete", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null] -> [simple type, clas...#688#-1772676274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isCollectionLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getRawClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getGenericSignature", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isContainerType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.MapType", "withValueHandler", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#592#-1744841854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getRawClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getKeyType", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isPrimitive", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findTypeParameters", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null] -> [simple type, class java.lang.Object]] {getErasedSigna...#607#-942389413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", ""}}), new String[][]{{"listIterator", "", "0"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isFinal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "7"}, {"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
