package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSign...#693#-1256557226", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "1.1234567", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:6>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "-2-1", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}}), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isConcrete", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "http://example.com/a?b=c<{\"a\":1}", "<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:5>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:8>", "<sample:4>"}}, 2), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isContainerType", "", "2"}, {"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:10>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "4"}, {"getErasedSignature", "", "4"}, {"containedType", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:10>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 2), new String[][]{{"isEnumType", "", "3"}, {"isMapLikeType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:9>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#554#-897873085", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#554#-897873085", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:12>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection<Ljava/lang/Object;>;...#539#-227205033", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>"}}), new String[][]{{"getParameterSource", "", "6"}, {"hasRawClass", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "true", "<sample:2>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[Ljava/util/List;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:7>"}}, 3), new String[][]{{"isGeneric", "", "4"}, {"getSuperType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("java.util.List<E> {isGeneric=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"isTrueCollectionType", "", "7"}, {"getTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:8>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:4>"}}), new String[][]{{"isPrimitive", "", "4"}, {"containedTypeCount", "", "4"}, {"withValueHandler", "java.lang.Object", "1"}, {"getGenericSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[Ljava/lang/String;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Object]] {getErasedSignature=[Ljava/lang/Object;, getGenericSignature=[Ljava/lang/Object;, getTypeName=[array type, component type: [simple t...#461#2071148443", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:4>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"getGenericSignature", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/String;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:1>", "<sample:5>"}}, 2), new String[][]{{"getRawClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:10>", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"getTypeName", "", "5"}, {"getTypeHandler", "", "7"}, {"containedTypeName", "int", "6"}, {"widenContentsBy", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Number, contains [collection type; class java.lang.String, contains [simple type, class java.lang.Object]]] {getErasedSignature=Ljava/lang/Number;, getGenericSig...#606#-1481926441", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:20>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:12>", "<null>", "<sample:5>"}}, 1), new String[][]{{"getValueHandler", "", "1"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "0"}, {"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Number]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:0>"}}, 1), new String[][]{{"constructRawCollectionType", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;, getType...#531#666275989", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:14>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 2), new String[][]{{"hasGenericTypes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<empty>", "<sample:2>"}}, 1), new String[][]{{"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<empty>", "<sample:2>"}}, 1), new String[][]{{"isAbstract", "", "4"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/lang/Object;>;, getTy...#533#-1687084154", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3), new String[][]{{"isAbstract", "", "0"}, {"widenKey", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Comparable, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Compa...#623#-331613049", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "0"}, {"widenKey", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, ...#615#1632314147", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.5f", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:9>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"toCanonical", "", "7"}, {"isArrayType", "", "3"}, {"getKeyType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaf...#643#1865476733", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}}, 2), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}}, 2), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}}, 2), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}}, 2), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:9>"}}, 2), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:9>"}}, 2), new String[][]{{"narrowBy", "java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#592#-170187779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 2), new String[][]{{"findTypeParameters", "java.lang.Class,java.lang.Class", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<null>"}}, 2), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:4>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:4>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:4>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("int {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<null>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"withTypeHandler", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;, getType...#531#666275989", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.5", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:0>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:9>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:5>"}}, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "6"}, {"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:5>"}}, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "6"}, {"isArrayType", "", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 3), new String[][]{{"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<null>", "<sample:8>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.util.List, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljav...#597#-883835719", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"isConcrete", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("int {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:9>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:9>", "<sample:1>"}}, 3), new String[][]{{"getContentType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:9>", "<sample:1>"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSign...#583#-1177083804", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}, {"toCanonical", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}, {"toCanonical", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is not a (subty", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is not a (subty", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:7>", "<empty>"}}, 3), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is nota (subty", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:6>"}}, 3), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "Strange Map type ", "<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isConcrete", "", "2"}, {"toCanonical", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/lang/Object;>;, getTy...#533#-1687084154", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false), new String[][]{{"isPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<empty>", "<sample:2>"}}), new String[][]{{"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<empty>", "<sample:2>"}}), new String[][]{{"isConcrete", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<empty>", "<sample:2>"}}), new String[][]{{"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<empty>", "<sample:2>"}}), new String[][]{{"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldin...#694#1996161288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Integer, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljav...#567#397785345", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:4>"}}), new String[][]{{"isAbstract", "", "0"}, {"widenKey", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class java.lang.Obje...#705#-1324889110", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#345#-2039533746", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]] {getErasedSignatur...#689#-624420849", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm...#660#847667973", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang....#717#-850104899", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [array type, component type: [simple type, class java.lang.String]]] {getErasedSignature=Lgenerated/alg...#673#1805207518", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "0x1F", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSign...#693#-174539102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getGenericSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf<Ljava/util/List<Ljava/lang/Object;>;>;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.5f", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<empty>"}}), new String[][]{{"getGenericSignature", "", "7"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.5f", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.5f", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<empty>"}}), new String[][]{{"getGenericSignature", "", "7"}, {"isCollectionLikeType", "", "0"}, {"containedTypeCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<empty>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<null>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaf...#643#-425582722", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}), new String[][]{{"getTypeHandler", "", "2"}, {"getErasedSignature", "", "1"}, {"getValueHandler", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:9>"}, false), new String[][]{{"getGenericSignature", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer<Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;>;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}}), new String[][]{{"constructArrayType", "com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> ...#763#-1044714348", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<null>"}}), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.util.List, contains [map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]]] {getErasedSignature=Ljava/util/Li...#626#-1817349836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:0>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}}), new String[][]{{"constructRawMapType", "java.lang.Class", "5"}, {"isTrueMapType", "", "5"}, {"withStaticTyping", "", "7"}, {"forcedNarrowBy", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm...#660#847667973", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:6>"}}), new String[][]{{"constructRawMapType", "java.lang.Class", "2"}, {"isTrueMapType", "", "5"}, {"withStaticTyping", "", "7"}, {"getTypeHandler", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:6>"}}), new String[][]{{"constructRawMapType", "java.lang.Class", "2"}, {"isTrueMapType", "", "5"}, {"withStaticTyping", "", "7"}, {"getParameterSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<empty>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<empty>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<empty>", "<null>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<empty>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.String]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, false), new String[][]{{"widenContentsBy", "java.lang.Class", "3"}, {"hasGenericTypes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:6>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:5>", "<sample:3>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:5>", "<sample:3>", "<empty>"}, false), new String[][]{{"useStaticType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchI...#701#-1423182637", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "1.5", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:0>"}}), new String[][]{{"isEnumType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:0>"}}), new String[][]{{"isEnumType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:5>"}}), new String[][]{{"withTypeHandler", "java.lang.Object", "6"}, {"isArrayType", "", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:3>"}}), new String[][]{{"getContentType", "", "4"}, {"hasRawClass", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}), new String[][]{{"containedTypeCount", "", "4"}, {"hasRawClass", "java.lang.Class", "7"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generate...#756#1122579811", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.String, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Lj...#569#1416569329", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "{\"a\":1}", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]]] {getErasedSignature=[Ljava/util/Map;, getGenericSignature=...#566#-452166253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "{\"a\":1}", "<sample:3>"}}), new String[][]{{"getRawClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.util.Map; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#555#473237370", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}), new String[][]{{"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.util.List, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljav...#597#-883835719", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:5>"}}), new String[][]{{"getContentType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>"}, false), new String[][]{{"isThrowable", "", "4"}, {"getErasedSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:7>"}}), new String[][]{{"getTypeName", "", "7"}, {"getErasedSignature", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:6>", "<null>"}}), new String[][]{{"getContentType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class int, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [collection type; class java.lang.String, contains [simple type, class generated.algori...#685#-1963739942", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:0>"}}), new String[][]{{"findTypeParameters", "java.lang.Class,java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:3>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#345#-2039533746", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:7>"}}), new String[][]{{"getRawClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:1>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#755#-701235777", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is not a subtype of ", "<sample:2>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is not a (subty", "<sample:5>"}, false, 10, new String[][]{}), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is not a (subty", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:7>", "<sample:0>"}}), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", " is nota (subty", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:6>"}}), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "Strange Map type ", "<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}}), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isConcrete", "", "2"}, {"toCanonical", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "http://example.com/a?b=c<", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isConcrete", "", "2"}, {"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "http://example.com/a?b=c<{\"a\":1F", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:5>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:8>", "<sample:4>"}}), new String[][]{{"useStaticType", "", "1"}, {"getErasedSignature", "", "3"}, {"isContainerType", "", "2"}, {"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "htt<7///dxa<mp;-0.0", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:15>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "5"}, {"getErasedSignature", "", "0"}, {"hasRawClass", "java.lang.Class", "2"}, {"isEnumType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "htt<7///dxa<mp;-0.0", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:8>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "5"}, {"getParameterSource", "", "0"}, {"hasRawClass", "java.lang.Class", "2"}, {"getTypeHandler", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false), new String[][]{{"hasGenericTypes", "", "7"}, {"getGenericSignature", "java.lang.StringBuilder", "6"}, {"appendCodePoint", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:8>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "htt<7///dxa<mp;-0.0Unrecognized Type: ", "<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:8>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "5"}, {"getParameterSource", "", "0"}, {"hasRawClass", "java.lang.Class", "2"}, {"withStaticTyping", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "htt<7///dxa<mp;-0.0Unrecognized Type: ", "<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:8>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"useStaticType", "", "5"}, {"getParameterSource", "", "0"}, {"hasRawClass", "java.lang.Class", "2"}, {"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<null>"}, false), new String[][]{{"getContentType", "", "6"}, {"isConcrete", "", "2"}, {"useStaticType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "-1", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"useStaticType", "", "5"}, {"getParameterSource", "", "0"}, {"hasRawClass", "java.lang.Class", "3"}, {"getGenericSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#422#-373858535", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "S.12345v67890123456", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:8>", "<sample:2>"}}), new String[][]{{"useStaticType", "", "5"}, {"getValueHandler", "", "0"}, {"getParameterSource", "", "3"}, {"getGenericSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "S.12345v67890123456", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:8>", "<sample:2>"}}), new String[][]{{"useStaticType", "", "5"}, {"getValueHandler", "", "0"}, {"getParameterSource", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "0x123456789", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:10>", "<sample:2>"}}, 2), new String[][]{{"useStaticType", "", "5"}, {"getValueHandler", "", "0"}, {"getParameterSource", "", "3"}, {"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "0x123456789", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:10>", "<sample:2>"}}), new String[][]{{"useStaticType", "", "5"}, {"getValueHandler", "", "0"}, {"getParameterSource", "", "3"}, {"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<null>"}}, 3), new String[][]{{"containedTypeName", "int", "1"}, {"hasGenericTypes", "", "2"}, {"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<null>"}}), new String[][]{{"containedTypeName", "int", "1"}, {"hasGenericTypes", "", "2"}, {"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:1>"}}, 1), new String[][]{{"containedTypeName", "int", "1"}, {"hasGenericTypes", "", "2"}, {"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>", "<sample:5>"}}, 1), new String[][]{{"containedTypeName", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 9, new String[][]{}), new String[][]{{"getParameterSource", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}, 1), new String[][]{{"getParameterSource", "", "4"}, {"widenContentsBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [map type; class int, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]]] {getErasedSignature=[I, getGenericSignature=[I<Ljava/lang/Object;Lja...#529#957013663", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "Title", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:2>", "<null>"}}), new String[][]{{"containedTypeName", "int", "1"}, {"getContentType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#554#-897873085", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<null>"}}, 1), new String[][]{{"getErasedSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava/util/Collection;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:3>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>"}}), new String[][]{{"hasGenericTypes", "", "1"}, {"hasRawClass", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:1>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "4"}, {"isMapLikeType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "4"}, {"isMapLikeType", "", "4"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "3"}, {"isMapLikeType", "", "4"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "3"}, {"isMapLikeType", "", "4"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:10>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}), new String[][]{{"isEnumType", "", "3"}, {"isMapLikeType", "", "4"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:10>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}), new String[][]{{"isEnumType", "", "3"}, {"isMapLikeType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:0>"}}, 2), new String[][]{{"isEnumType", "", "3"}, {"widenContentsBy", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:14>", "<sample:0>"}}, 2), new String[][]{{"isEnumType", "", "3"}, {"widenContentsBy", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Integer]] {getErasedSignature=[Ljava/lang/Integer;, getGenericSignature=[Ljava/lang/Integer;, getTypeName=[array type, component type: [simpl...#464#779297832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:14>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:14>", "<sample:0>"}}, 1), new String[][]{{"isEnumType", "", "3"}, {"widenContentsBy", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Integer]] {getErasedSignature=[Ljava/lang/Integer;, getGenericSignature=[Ljava/lang/Integer;, getTypeName=[array type, component type: [simpl...#464#779297832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<null>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class [Ljava.lang.String;, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.Searc...#705#1446486064", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:5>", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
}
