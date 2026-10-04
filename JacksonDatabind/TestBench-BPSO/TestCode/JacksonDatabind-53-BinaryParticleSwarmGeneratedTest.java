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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", "java.lang.String", ".1"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.Object<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundName", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}), new String[][]{{"toCanonical", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<sample:4>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.String]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:16>", "<sample:0>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:16>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{"0x1234567"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:11>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:13>", "<sample:8>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:9>", "<sample:20>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "-0.0truf"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:17>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [r...#700#1060864698", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:8>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "byte"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:14>", "<sample:7>", "<sample:14>", "<sample:0>"}}), new String[][]{{"withStaticTyping", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:3>", "<sample:17>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:13>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:14>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:20>", "<sample:17>", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList<Ljava/lang/Object;>;, g...#538#-316295437", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:15>", "<sample:18>", "<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#562#216851838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:7>", "<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:4>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"long"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class long] {getErasedSignature=J, getGenericSignature=J;, getTypeName=[simple type, class long], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isColl...#375#1947621600", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "3"}, {"findBoundType", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "char "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:3>", "<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}}, 2), new String[][]{{"getRawClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:13>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:16>", "<sample:6>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<java.lang.Object>] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable<Ljava/lang/Object;>;, getTypeName=[simple type, class ...#505#-1053239046", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:17>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>] {getErasedSignature=Lgenerated/algorithm/SearchInputF...#656#-1125481379", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"getBoundName", "int", "6"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"void"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "<a>b</a>short", "true", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class void] {getErasedSignature=V, getGenericSignature=V;, getTypeName=[simple type, class void], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isColl...#375#-1799793312", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:7>", "<sample:11>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<null>"}}), new String[][]{{"containedTypeCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:13>", "<sample:6>", "<sample:7>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:15>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$TypeSamples] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$TypeSamp.., getGenericSignature=Lgenerated/a...#593#-1168679178", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:9>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:2>"}}), new String[][]{{"isFinal", "", "0"}, {"containedType", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:8>", "<sample:2>", "<sample:14>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:1>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class [Ljava.lang.String;<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignat...#568#288372307", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:14>", "<sample:4>"}, true), new String[][]{{"getBoundName", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:12>", "<sample:7>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/Collection;, getGenericSignatu...#605#-1312520611", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:8>"}}, 3), new String[][]{{"withStaticTyping", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:7>", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "boolean"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:1>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:16>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple t...#690#2140410191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:7>"}}, 1), new String[][]{{"setReference", "com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]]] {getErasedSignature=Lgenerated/algo...#634#-1676182118", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:14>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<empty>", "<sample:1>"}}), new String[][]{{"toCanonical", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList<java.lang.Object>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 1), new String[][]{{"containedType", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:2>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:1>"}}), new String[][]{{"getBindings", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<Ljava/lang/Object;> {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"withUnboundVariable", "java.lang.String", "3"}, {"hasUnbound", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"float"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "1.12345678double", "true", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("float {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=float, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1908465553", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:7>"}}, 2), new String[][]{{"moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"double"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:9>"}}), new String[][]{{"getContentTypeHandler", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "short"}}), new String[][]{{"findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:19>"}}), new String[][]{{"getContentValueHandler", "", "6"}, {"getBindings", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"int"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}}, 3), new String[][]{{"getValueHandler", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/lang/Object;>;, getTy...#534#-738736229", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "-0.0true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:3>", "<sample:10>", "<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.String, [simple type, class java.lang.Object] -> [simple type, class java.lang.String]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Lj...#577#-963306852", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<empty>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:3>", "<sample:9>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "hasUnbound", "java.lang.String", " 1L"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "asKey", "java.lang.Class", "<sample:6>"}}, 3), new String[][]{{"getBoundName", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] -> [simple type, class generat...#766#-25201303", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "asKey", "java.lang.Class", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "hasUnbound", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:0>", "<sample:7>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "n>", "false", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:8>", "<sample:1>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "emptyBindings", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"asKey", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.Integer<>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "<a>b</a>char"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "5is", "true", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getBoundName", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:2>", "<sample:10>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:9>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:2>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "hasUnbound", "java.lang.String", "21474483648"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", ""}}, 3), new String[][]{{"getTypeParameters", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:5>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "typeParameterArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:2>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", "java.lang.String", "1.2234567890123456"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.Object<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:8>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:18>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:8>", "<sample:7>", "<sample:3>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSign...#611#1505451072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "equals", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:16>", "<sample:1>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<null>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "isEmpty", ""}}, 1), new String[][]{{"findBoundType", "java.lang.String", "1"}, {"getBoundName", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "getTypeParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundName", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1), new String[][]{{"containedTypeName", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:3>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getBoundName", "int", "1"}, {"hasUnbound", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:9>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:2>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "-0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:18>", "<sample:18>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:16>", "<sample:2>", "<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:16>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:12>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:14>", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 1), new String[][]{{"isPrimitive", "", "1"}, {"getContentType", "", "4"}, {"containedType", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:5>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:6>", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundType", "int", "65518"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundType", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:16>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:0>", "<null>"}}, 3), new String[][]{{"getContentValueHandler", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:18>", "<sample:11>", "<sample:15>", "<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"getErasedSignature", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:20>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:9>", "<sample:16>"}}, 2), new String[][]{{"getParameterSource", "", "4"}, {"isCollectionLikeType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:5>", "<sample:9>", "<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<empty>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", new String[]{"java.lang.String"}, new String[]{"Mi"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<empty>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<empty>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$Ge...#817#894311859", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "typeParameterArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [resolved recursive type -> null]] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: [resolved...#489#599206215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.util.List] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List;, getTypeName=[simple type, class java.util.List], hasGenericTypes=false, hasValueHandler=...#426#-1529791547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:8>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:8>", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "getTypeParameters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:0>", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>"}, true), new String[][]{{"getBoundName", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<empty>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", new String[]{"java.lang.String"}, new String[]{"abaaaaaLaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<empty>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<empty>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "hasUnbound", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:10>"}}), new String[][]{{"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"5/s"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#620#1100558089", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:2>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "s"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lj...#577#-723580654", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "emptyBindings", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:10>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "getBoundName", new String[]{"int"}, new String[]{"-7"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundType", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"50s"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:6>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", new String[]{"java.lang.String"}, new String[]{"nong with "}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class int, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=I, getGenericSignature=I<Lgenerated/algorithm/SearchI...#571#-1698202280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"foat"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false), new String[][]{{"getParameterSource", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<empty>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<empty>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:2>"}, true), new String[][]{{"getTypeParameters", "", "6"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "emptyBindings", new String[]{}, new String[]{}, true), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:0>", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:3>", "<sample:1>", "<sample:6>", "<sample:1>"}}), new String[][]{{"toCanonical", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String<java.lang.Object>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:1>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:1>", "<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<Ljava/lang/Object;> {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", "java.lang.String", "PT1\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundName", "int", "32"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "hasUnbound", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:6>", "<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.String<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:8>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, getTy...#534#-1519196067", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String", "boolean", "java.lang.ClassLoader"}, new String[]{"<", "false", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:9>", "<sample:7>", "<sample:2>"}}), new String[][]{{"getRawClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "typeParameterArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"hasUnbound", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}), new String[][]{{"isFinal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "getBoundType", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "asKey", "java.lang.Class", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:9>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:6>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:4>", "<sample:9>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.Comparable]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<empty>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:7>", "<sample:3>", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<empty>", "<sample:6>", "<null>", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "t"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<empty>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:9>", "<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:10>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<empty>", "<sample:7>"}}), new String[][]{{"containedTypeName", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:4>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Number] {getErasedSignature=Ljava/lang/Number;, getGenericSignature=Ljava/lang/Number;, getTypeName=[simple type, class java.lang.Number], hasGenericTypes=false, hasValue...#435#-1385363542", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:11>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "asKey", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "getBoundType", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("int<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<empty>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:8>", "<sample:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [resolved recursive type -> null]] -> ...#806#-554672535", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:5>", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "size", ""}, {"com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "toString", ""}, {"com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", "java.lang.String", "Tt"}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}), new String[][]{{"containedTypeCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{"-0.d"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:0>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:7>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:8>", "<sample:0>"}}), new String[][]{{"getGenericSignature", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:3>", "<sample:0>", "<sample:3>"}, false), new String[][]{{"getBindings", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:9>", "<sample:0>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.util.Map<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignature=Ljava/util/Map;, getGenericSignature=!NullPoi...#556#-2093800234", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:1>", "<sample:7>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "equals", "java.lang.Object", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.Integer<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:9>", "<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:5>"}}), new String[][]{{"containedTypeName", "int", "1"}, {"containedType", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<sample:3>"}, true), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "equals", "java.lang.Object", "<i:-159>"}}), new String[][]{{"getTypeParameters", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:1>"}}), new String[][]{{"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "asKey", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeBindings", "findBoundType", "java.lang.String", ""}}), new String[][]{{"findBoundType", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>", "<sample:4>"}}), new String[][]{{"withStaticTyping", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/Se...#624#2135585449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignatu...#652#-990335633", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:8>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:1>"}}), new String[][]{{"getBindings", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:10>"}, false, 7, new String[][]{}), new String[][]{{"getInterfaces", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "\t."}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:11>", "<empty>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false), new String[][]{{"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:10>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "emptyBindings", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "", "2"}, {"getBoundType", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}), new String[][]{{"getBindings", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "withUnboundVariable", new String[]{"java.lang.String"}, new String[]{"1E-55"}, false, 1, new String[][]{}), new String[][]{{"withUnboundVariable", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeBindings", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "createIfNeeded", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class int]] {getErasedSignature=[I, getGenericSignature=[I;, getTypeName=[array type, component type: [simple type, class int]], hasGenericTypes=false, hasVa...#435#-23583890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "create", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>"}, true), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.type.TypeBindings", "asKey", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.util.Collection<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:13>", "<sample:3>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:11>", "<sample:2>"}}), new String[][]{{"getSuperClass", "", "0"}, {"withTypeHandler", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignatu...#652#-990335633", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:3>", "<sample:6>"}}), new String[][]{{"getContentTypeHandler", "", "4"}, {"containedTypeName", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:9>"}, false, 6, new String[][]{}), new String[][]{{"findSuperType", "java.lang.Class", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>"}, false, 5, new String[][]{}), new String[][]{{"isJavaLangObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:2>", "<sample:1>", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>] {getErasedSignature=Lgenerated/algorithm/SearchInputF...#615#331993763", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<empty>", "<sample:9>", "<sample:13>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:12>", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
 }
}
