package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-2093806568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-0.01.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "anull.", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:16>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false), new String[][]{{"getKeyType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:17>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#566#1918679286", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "1.1234567 <not subtype of "}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$Gen...#692#-1301509936", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:8>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "1.123456678", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:12>"}}, 1), new String[][]{{"isCollectionLikeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:22>", "<null>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "[,I]", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:11>", "<sample:14>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:4>"}}), new String[][]{{"containedType", "int", "2"}, {"isConcrete", "", "3"}, {"getContentType", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:6>", "<null>"}}, 3), new String[][]{{"containedTypeCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:15>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Object;>;, getTypeName=[col...#521#1138428659", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "1{\"<a\":1ia b", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:13>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "5"}, {"insert", "int,char[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[Lja a0va/lang/String;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection<Ljava/lang/Object;>;...#539#-227205033", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:10>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "-1"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>", "<sample:12>"}}), new String[][]{{"isPrimitive", "", "4"}, {"getGenericSignature", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Comparable;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:9>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"isMapLikeType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:22>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:8>"}}), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:15>", "<sample:20>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:12>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:8>", "<sample:19>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"isContainerType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:8>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:14>", "<sample:21>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:15>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.String]] {getErasedSignature=[Ljava/lang/String;, getGenericSignature=[Ljava/lang/String;, getTypeName=[array type, component type: [simple t...#461#-634645207", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:5>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.Object]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:14>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList<Ljava/lang/Object;>;, g...#537#-641319800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:9>", "<sample:12>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:6>"}}, 2), new String[][]{{"getKeyType", "", "3"}, {"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Map, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/...#591#-608416761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:21>", "<sample:1>"}, false, 6, new String[][]{}, 2), new String[][]{{"withValueHandler", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Number]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Number;>;, getTypeName=[col...#521#505542279", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:22>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:0>", "<sample:5>"}}, 2), new String[][]{{"isEnumType", "", "4"}, {"getErasedSignature", "java.lang.StringBuilder", "4"}, {"append", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:5>", "<sample:13>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:9>"}}, 2), new String[][]{{"isTrueMapType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [s...#790#1205754157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type,...#910#-1191184092", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory...#648#-197305195", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "1.1234567 not subtype of ", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:9>"}, false, 0, null, 2), new String[][]{{"isArrayType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:8>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:7>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#345#-2039533746", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:19>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.Sea...#704#-464629238", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getRawClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:18>"}, false, 0, null, 2), new String[][]{{"getValueHandler", "", "5"}, {"hasGenericTypes", "", "4"}, {"containedTypeOrUnknown", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:19>", "<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:20>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaf...#763#836568462", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 2), new String[][]{{"containedType", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:18>"}, false, 0, null, 2), new String[][]{{"narrowBy", "java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 2), new String[][]{{"containedType", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", "java.lang.reflect.Type,java.lang.Class", "<sample:12>", "<sample:19>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:9>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory...#648#-197305195", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:16>", "<sample:11>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:13>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:16>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "1.22346678", "<sample:6>"}, false, 3, new String[][]{}, 2), new String[][]{{"isConcrete", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:16>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "aaaaaaaaaaa,aaaaaaaaaaaaaaaaaa", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:7>", "<sample:9>", "<sample:11>"}}, 3), new String[][]{{"getContentType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:11>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:19>", "<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"getKeyType", "", "6"}, {"toCanonical", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:4>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "5", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:2>"}}, 1), new String[][]{{"getContentType", "", "4"}, {"getGenericSignature", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:6>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSign...#583#-1177083804", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:21>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:8>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:9>", "<sample:19>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:8>", "<sample:12>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:22>", "<sample:21>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:2>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"constructRawCollectionLikeType", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_...#647#-1997913240", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"constructFromCanonical", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:20>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("java.lang.String {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:17>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:4>"}}, 3), new String[][]{{"isConcrete", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:19>"}, false, 2, new String[][]{}, 3), new String[][]{{"narrowContentsBy", "java.lang.Class", "4"}, {"getGenericSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer<Ljava/lang/Object;Ljava/lang/Integer;>;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:18>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<null>"}}, 2), new String[][]{{"getParameterSource", "", "5"}, {"getParameterSource", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:19>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:15>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:9>", "<sample:2>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"constructArrayType", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#592#-170187779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("java.lang.String {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", "java.lang.Class,java.util.List", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaff...#642#-2051164811", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.String, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Lj...#569#1416569329", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#566#1918679286", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/lang/Object;>;, getTypeNam...#528#-723317353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"isInterface", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:4>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:5>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:9>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"getErasedSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true), new String[][]{{"useStaticType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:8>"}, false), new String[][]{{"getTypeHandler", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#345#-2039533746", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructArrayType", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class int]] {getErasedSignature=[I, getGenericSignature=[I;, getTypeName=[array type, component type: [simple type, class int]], hasGenericTypes=false, isAbs...#407#-448253470", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"J"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "+1\t", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"isThrowable", "", "1"}, {"withContentValueHandler", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Integer, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;, ge...#536#129165813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"isConcrete", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/l...#565#-870530264", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, isAb...#410#794129455", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaff...#763#2059874868", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:8>", "<sample:7>"}}), new String[][]{{"getContentType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:8>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.String]] {getErasedSignature=[Ljava/lang/String;, getGenericSignature=[Ljava/lang/String;, getTypeName=[array type, component type: [simple t...#461#-634645207", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class int]] {getErasedSignature=[I, getGenericSignature=[I;, getTypeName=[array type, component type: [simple type, class int]], hasGenericTypes=false, isAbs...#407#-448253470", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<null>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"hasGenericTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:12>", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}), new String[][]{{"isInterface", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "0x1FTITLE", "<sample:0>"}, false), new String[][]{{"getKeyType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.util.List<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/util/List;,...#597#1564494165", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:8>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:13>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "6"}, {"delete", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("ampleLjava/util/List;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:2>", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"isCollectionLikeType", "", "2"}, {"getParameterSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:4>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"containedTypeCount", "", "6"}, {"containedType", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSigna...#692#-1551787809", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:13>", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, isAb...#410#794129455", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isEnumType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "+21.5", "<sample:7>"}, false), new String[][]{{"withContentTypeHandler", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:19>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:4>", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:9>"}}), new String[][]{{"getContentType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:19>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:6>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:8>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:16>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperInterfaceChain", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:16>", "<sample:2>", "<null>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.String]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:0>"}, false), new String[][]{{"constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]]] {getErasedSignature=Ljava/lang/Inte...#628#-230294590", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:20>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "{\"a\":1}", "<sample:6>"}}), new String[][]{{"getContentType", "", "2"}, {"narrowContentsBy", "java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false), new String[][]{{"narrowContentsBy", "java.lang.Class", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "6"}, {"insert", "int,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:19>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<null>"}}), new String[][]{{"getKeyType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:4>"}, false), new String[][]{{"constructParametricType", "java.lang.Class,java.lang.Class[]", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.Integer>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSig...#584#-1209347023", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:18>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}), new String[][]{{"constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Lja...#599#2042681831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:18>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:11>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:1>"}}), new String[][]{{"getValueHandler", "", "5"}, {"getParameterSource", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:7>", "<sample:16>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:6>", "<sample:5>"}}), new String[][]{{"isInterface", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:18>"}, false, 6, new String[][]{}), new String[][]{{"getErasedSignature", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:12>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"getParameterSource", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:0>"}}), new String[][]{{"constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "2"}, {"isContainerType", "", "0"}, {"getRawClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#407#-704994174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:13>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSign...#693#143344143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>"}}), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub<Ljava/lang/Object;>;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:11>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:11>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class int, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algorithm.SearchIn...#812#-713090924", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#755#-701235777", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:10>", "<sample:3>"}, false), new String[][]{{"getTypeHandler", "", "6"}, {"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperClassChain", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"setSuperType", "com.fasterxml.jackson.databind.type.HierarchicType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.HierarchicType", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isGeneric=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findSuperTypeChain", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:9>"}, false, 6, new String[][]{}), new String[][]{{"deepCloneWithoutSubtype", "", "2"}, {"isGeneric", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:20>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:10>"}}), new String[][]{{"containedTypeCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false), new String[][]{{"hasGenericTypes", "", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I<Ljava/lang/Object;>;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>"}, false), new String[][]{{"getErasedSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/String;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false), new String[][]{{"isTrueMapType", "", "2"}, {"hasGenericTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>", "<sample:4>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:12>", "<sample:5>"}, false), new String[][]{{"hasRawClass", "java.lang.Class", "1"}, {"getTypeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:0>"}}), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:5>"}}), new String[][]{{"withStaticTyping", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:5>"}, false, 2, new String[][]{}), new String[][]{{"getKeyType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:18>"}, false), new String[][]{{"isInterface", "", "6"}, {"getParameterSource", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:6>"}}), new String[][]{{"isConcrete", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructType", "java.lang.reflect.Type,java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, isAb...#410#794129455", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generate...#756#-732388926", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParameterizedClass", new String[]{"java.lang.Class", "java.util.List"}, new String[]{"<sample:1>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:8>"}}), new String[][]{{"narrowContentsBy", "java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:12>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:8>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection<Ljava/lang/Object;>;...#539#-227205033", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:19>", "<sample:16>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<null>"}}), new String[][]{{"toCanonical", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:11>"}, false, 3, new String[][]{}), new String[][]{{"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:11>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub...#729#-773674389", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:15>", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class int, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]] {getErasedSignature=I, getGenericSignature=I<Lgenerated/algorithm/Search...#571#-316624065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:19>", "<sample:17>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:16>", "<sample:9>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,java.lang.Object>] {getErasedSignature=Lgenerated/algori...#644#-74764335", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:4>"}}), new String[][]{{"containedTypeCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:20>", "<sample:10>"}, false, 6, new String[][]{}), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains [simple type, class java.lang.Object]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:3>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:4>"}}), new String[][]{{"isAbstract", "", "4"}, {"isEnumType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:10>", "<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:19>"}, false), new String[][]{{"getTypeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Integer, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding...#693#181337785", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructType", "java.lang.reflect.Type", "4"}, {"getContentType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:12>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Integer]] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection<Ljava/lang/Integer;...#541#604583663", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:7>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-2093806568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:21>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_doFindSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class", "<sample:5>", "<sample:19>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:8>", "<sample:6>"}}), new String[][]{{"isContainerType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveVariableViaSubTypes", new String[]{"com.fasterxml.jackson.databind.type.HierarchicType", "java.lang.String", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "1e10 parameters, was given ", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}), new String[][]{{"containedType", "int", "4"}, {"isContainerType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>"}, false), new String[][]{{"getValueHandler", "", "6"}, {"widenContentsBy", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [collection-like type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErased...#649#1150924072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:3>"}, false), new String[][]{{"constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.List, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaffo...#714#-2091233290", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructType", "com.fasterxml.jackson.core.type.TypeReference", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:19>", "<sample:11>", "<sample:2>"}}), new String[][]{{"isEnumType", "", "0"}, {"getParameterSource", "", "2"}, {"isEnumType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding...#693#181337785", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$Generic...#663#-1293859092", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false), new String[][]{{"getValueHandler", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:10>", "<sample:5>"}, false, 4, new String[][]{}), new String[][]{{"getContentType", "", "2"}, {"useStaticType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:16>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/ArrayList;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:16>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:1>"}}), new String[][]{{"isEnumType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "0"}, {"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.List, [simple type, class int] -> [array type, component type: [simple type, class java.lang.String]]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/L...#560#1434400781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, false), new String[][]{{"getValueHandler", "", "7"}, {"narrowContentsBy", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#592#-170187779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false), new String[][]{{"useStaticType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:1>"}}), new String[][]{{"narrowBy", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_hashMapSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:0>"}}), new String[][]{{"widenContentsBy", "java.lang.Class", "4"}, {"narrowContentsBy", "java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:9>", "<sample:9>"}, false), new String[][]{{"hasGenericTypes", "", "6"}, {"getParameterSource", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:9>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:12>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.String]] {getErasedSignature=[Ljava/lang/String;, getGenericSignature=[Ljava/lang/String;, getTypeName=[array type, component type: [simple t...#461#-634645207", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:16>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:20>", "<empty>"}, false, 7, new String[][]{}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"getValueHandler", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:12>", "<sample:3>"}}), new String[][]{{"containedType", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_arrayListSuperInterfaceChain", "com.fasterxml.jackson.databind.type.HierarchicType", "<sample:8>"}}), new String[][]{{"toCanonical", "", "6"}, {"containedType", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:6>", "<sample:22>", "<sample:2>"}}), new String[][]{{"getTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
}
