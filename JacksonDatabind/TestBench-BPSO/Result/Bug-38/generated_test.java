package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getGenericSignature", "java.lang.StringBuilder", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:6>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type; class generated.algorithm.SearchInputFactory...#662#-664917283", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:5>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:5>", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false), new String[][]{{"forcedNarrowBy", "java.lang.Class", "4"}, {"getErasedSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>", "<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {ge...#664#143787982", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<i:-8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isMapLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withContentValueHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "_narrow", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.MapType", "containedTypeCount", ""}}, 2), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [collection-lik...#760#1547650271", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}}), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"getContentType", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false), new String[][]{{"forcedNarrowBy", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {getErasedSignature=Ljava/util/List;, getGenericSig...#569#-1685990132", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"withContentValueHandler", "java.lang.Object", "2"}, {"getInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", "int", "-2147483648"}}), new String[][]{{"withStaticTyping", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"getGenericSignature", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", "java.lang.Object", "<i:0>"}}), new String[][]{{"isPrimitive", "", "7"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:-1.31>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<sample:0>"}}), new String[][]{{"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:5>", "<sample:1>"}, true), new String[][]{{"getBindings", "", "1"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"containedTypeCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"withStaticTyping", "", "7"}, {"containedTypeName", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aP9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:`9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 2), new String[][]{{"getRawClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>"}, true), new String[][]{{"withContentValueHandler", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class int, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=I, getGenericSignature=I<Lgenerated/algorithm/SearchInputF...#566#-874438188", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getErasedSignature", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<nu...#628#390679327", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "4105"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", "java.lang.Class", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getKeyType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>", "<null>", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSign...#569#-1148402317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"isThrowable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isArrayType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getRawClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedType", "int", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getValueHandler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", "java.lang.Class", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3), new String[][]{{"findSuperType", "java.lang.Class", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isTrueCollectionType", ""}}, 2), new String[][]{{"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", "int", "0"}, {"com.fasterxml.jackson.databind.type.CollectionType", "isConcrete", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3), new String[][]{{"useStaticType", "", "4"}, {"isContainerType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"hasValueHandler", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:46>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", "java.lang.StringBuilder", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getContentTypeHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", "java.lang.StringBuilder", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isInterface", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:!a99>"}, false, 0, null, 2), new String[][]{{"hasRawClass", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hasGenericTypes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:5>", "<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", "java.lang.Object", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}}, 3), new String[][]{{"findSuperType", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getBindings", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, true, 0, null, 2), new String[][]{{"insert", "int,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lg3enerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"hasUnbound", "java.lang.String", "5"}, {"getTypeParameters", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<s:\"a9>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "isPrimitive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Number, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/Number;, getGen...#577#2008196200", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/String;, getGen...#576#-1761939577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isJavaLangObject", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedType", new String[]{"int"}, new String[]{"32770"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findTypeParameters", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedTypeName", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSign...#569#-1148402317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getValueHandler", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isArrayType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "findSuperType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.MapType", "containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class java.lang.Object, null -> null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[map type; class java.lang.Object, null -> null], hasGen...#457#-166972161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isAbstract", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "_narrow", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#665#-204701332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:a9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#592#-1744841854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {getErasedSignature=Ljava/lang/Integer;, getGene...#575#-1933276797", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"40"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isMapLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:3>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toCanonical", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isPrimitive", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isCollectionLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", "java.lang.Object", "<s:kIey{>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getSuperClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<empty>"}}), new String[][]{{"getContentTypeHandler", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTrueCollectionType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeCount", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483622"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getContentTypeHandler", ""}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}, {"insert", "int,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lj0ava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"toCanonical", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isAbstract", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:keyp>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedType", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedType", new String[]{"int"}, new String[]{"-510"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isContainerType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "useStaticType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"getContentValueHandler", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483597"}, false, 3, new String[][]{}), new String[][]{{"containedTypeName", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false), new String[][]{{"insert", "int,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isFinal", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "withStaticTyping", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:a9>"}, false), new String[][]{{"getInterfaces", "", "5"}, {"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "isFinal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isContainerType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("322547479", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getTypeHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleI", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:\"a9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "_narrow", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class [Ljava.lang.String;, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=L[Ljava/lang/String;;, ...#582#1555571015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<i:-32767>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"isInterface", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}), new String[][]{{"getInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, null -> null]] {get...#663#-1765015068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"withContentValueHandler", "java.lang.Object", "2"}, {"useStaticType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:10>", "<sample:1>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findSuperType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains n...#673#-1628037471", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=Ljava/lang/Object;, ...#582#2054462534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "withTypeHandler", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "buildCanonicalName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:2>", "<sample:2>"}, false), new String[][]{{"getContentValueHandler", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<sample:6>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true), new String[][]{{"indexOf", "java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483648"}, false), new String[][]{{"getKeyType", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getParameterSource", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true), new String[][]{{"insert", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("s\000ampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getKeyType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection type; class java.lang.Object, contains null] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=!NullPointerException, getTypeName=[collection type; class java.lang.Object, contai...#473#-1878815347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"isCollectionLikeType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:8>", "<empty>", "false"}, true), new String[][]{{"append", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("L[Ljava/lang/String;2", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<s:a9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "getBindings", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", ""}}), new String[][]{{"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleL[Ljava/lang/String;;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "hasGenericTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "findTypeParameters", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.CollectionType", "containedTypeName", "int", "10"}}), new String[][]{{"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:k?Iey{>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedType", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "withKeyTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "isInterface", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.type.MapType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapType", "_narrow", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [map-like type;...#752#383127280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.type.CollectionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionType", "equals", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {...#666#-1191429849", SearchInputFactory_scaffolding.receiverState());
 }
}
