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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<null>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:1>"}}), new String[][]{{"constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:3>", "<sample:10>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSign...#569#-1148402317", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:10>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#562#216851838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"int"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:9>", "<sample:4>", "<sample:0>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class int]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<I;>;, getTypeName=[collection type; class java.util...#493#-488746730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:7>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#562#216851838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"boolean"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("boolean {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#352#-1058557127", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:2>", "<empty>"}}), new String[][]{{"isPrimitive", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection<Ljava/lang/Object;>;...#540#-220109180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:12>", "<sample:7>", "<sample:4>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<sample:10>"}}), new String[][]{{"findSuperType", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"char"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class char] {getErasedSignature=C, getGenericSignature=C;, getTypeName=[simple type, class char], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isColl...#375#305097024", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:8>"}}, 2), new String[][]{{"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:6>"}, false, 4, new String[][]{}), new String[][]{{"findTypeParameters", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:5>", "<sample:10>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:3>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"i6t"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "float"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:13>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"Strange Map type "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "double"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"short"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:12>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("short {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=short, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1867463505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:4>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "byte"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:3>"}}, 2), new String[][]{{"isReferenceType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:13>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "1.112345778"}}), new String[][]{{"getClassLoader", "", "1"}});
  assertNotNull(actual);
  assertEquals("jdk.internal.loader.ClassLoaders$PlatformClassLoader", actual.getClass().getName());
  assertEquals("{getDefinedPackages=[package java.sql, package sun.text.resources.cldr.ext, pack.., getName=platform, isRegisteredAsParallelCapable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "<sample:1>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:10>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:11>", "<sample:12>", "<sample:0>"}}, 1), new String[][]{{"isInterface", "", "0"}, {"withContentType", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("null {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=null, hasGenericTypes=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollec...#375#1239190620", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>", "<sample:1>"}}), new String[][]{{"getBindings", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;,Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;> {isEmpty=false, size=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Object]] {getErasedSignature=[Ljava/lang/Object;, getGenericSignature=[Ljava/lang/Object;, getTypeName=[array type, component type: [simple t...#489#1618332071", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"boolean"}, false, 0, null, 3), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleZ;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:9>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:14>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<null>] -> [simple typ...#646#-694734007", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"Unrecognized Type: Strange Reference type "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "long"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<empty>", "<sample:14>", "<sample:1>"}}, 3), new String[][]{{"constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Integer, [simple type, class java.lang.Object] -> [collection type; class java.util.List, contains [simple type, class java.lang.Object]]] {getErasedSignature=Ljava/lan...#635#1654852102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:13>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:11>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:15>", "<sample:6>", "<sample:3>"}}), new String[][]{{"getTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"void"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "booleani"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("void {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=void, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#1650573203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:0>", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>", "<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{"-,1"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:6>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class java.lang.Object]]] {getErasedSignature=[[Ljava/lang/Object;, getGenericSignature=[[Ljava/lang/Object;, getTypeName=[array...#521#227724180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"getContentType", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:11>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:7>"}}, 3), new String[][]{{"containedTypeCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<empty>", "<sample:3>"}, false, 6, new String[][]{}, 1), new String[][]{{"useStaticType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"constructArrayType", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Object]] {getErasedSignature=[Ljava/lang/Object;, getGenericSignature=[Ljava/lang/Object;, getTypeName=[array type, component type: [simple t...#489#1618332071", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:15>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"sh"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:5>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "<a>b</a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:1>", "<sample:8>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<empty>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "1.12345678"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:2>", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:11>", "<sample:3>"}}, 2), new String[][]{{"findSuperType", "java.lang.Class", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<empty>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:8>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:12>", "<empty>"}}, 2), new String[][]{{"forcedNarrowBy", "java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:0>", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:3>", "<sample:5>"}}, 2), new String[][]{{"getParameterSource", "", "7"}, {"getBindings", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;> {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"withValueHandler", "java.lang.Object", "3"}, {"getTypeHandler", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("null {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=null, hasGenericTypes=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollec...#375#1239190620", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:8>", "<sample:8>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:15>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "a,b,c"}}, 3), new String[][]{{"getSuperClass", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:4>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:3>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:8>", "<sample:0>"}}, 3), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"[null^"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:12>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:12>", "<sample:3>"}}, 2), new String[][]{{"constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:6>", "<sample:2>"}}, 3), new String[][]{{"hasGenericTypes", "", "5"}, {"isThrowable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:3>", "<null>"}}, 1), new String[][]{{"constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "0"}, {"containedTypeOrUnknown", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSign...#611#1505451072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:1>", "<null>"}}, 3), new String[][]{{"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:9>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:8>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<null>"}}, 1), new String[][]{{"containedType", "int", "7"}, {"forcedNarrowBy", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("null {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=null, hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollect...#374#-1127547801", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>", "<sample:3>"}, false, 6, new String[][]{}, 2), new String[][]{{"getContentValueHandler", "", "7"}, {"getBindings", "", "1"}, {"getBoundType", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "fllobtt"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.util.List<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub><[collection type; class generated.alg...#689#-1509204292", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<null>"}}, 2), new String[][]{{"constructRawCollectionType", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:0>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:10>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<empty>", "<sample:1>"}}, 3), new String[][]{{"isJavaLangObject", "", "3"}, {"isThrowable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:12>", "<sample:2>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:1>", "<sample:10>"}}, 3), new String[][]{{"getSuperClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGeneri...#574#1250430048", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:3>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"getBindings", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<empty>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:9>", "<sample:9>", "<sample:10>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:9>", "<sample:6>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{}, 2), new String[][]{{"containedTypeCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:11>", "<null>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:11>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:12>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:9>", "<sample:15>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"withValueHandler", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:6>", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"constructRawMapType", "java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_sc...#603#-1335577720", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:6>"}, false), new String[][]{{"constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:8>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:9>", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:8>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:4>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"fllobt"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaStrange Reference type "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:2>", "<sample:0>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}), new String[][]{{"constructRawMapLikeType", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Integer, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer...#580#1442940204", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_sc...#603#-1335577720", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:4>", "<empty>"}}), new String[][]{{"containedTypeName", "int", "3"}, {"getRawClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., g...#650#-1757746954", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<null>", "<sample:1>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.util.List] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List;, getTypeName=[simple type, class java.util.List], hasGenericTypes=false, hasValueHandler=...#426#-1529791547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:0>"}, false), new String[][]{{"constructCollectionLikeType", "java.lang.Class,java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:8>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false), new String[][]{{"isInterface", "", "6"}, {"getTypeHandler", "", "0"}, {"getParameterSource", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/lang/Object;>;, getTy...#534#-738736229", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "Unrercognized Type: "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"1.123x4567890+234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:6>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.String, null -> null] {getErasedSignature=Ljava/lang/String;, getGenericSignature=!NullPointerException, getTypeName=[map-like type; class java.lang.String, null -> nul...#467#523469493", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:8>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:2>", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "a,b,c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:12>", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"findClass", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "unknownType", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:0>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[simple type, class generated.algorithm.SearchInputFa...#742#-1327266266", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String", "boolean", "java.lang.ClassLoader"}, new String[]{"1.5f1.1234567890123456", "true", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<empty>", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<sample:8>", "<sample:2>", "<empty>"}, false, 5, new String[][]{}), new String[][]{{"useStaticType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:7>", "<sample:2>"}}), new String[][]{{"constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class int<java.lang.Object<[simple type, class java.lang.Object]>] {getErasedSignature=I, getGenericSignature=I<Ljava/lang/Object;;, getTypeName=[reference type, class int<java.lang.O...#489#1075124288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:10>", "<sample:0>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:15>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true), new String[][]{{"constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "+11"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:4>", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<empty>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "abc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Comparable, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable<Ljava/lang/Obje...#545#-629332878", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:0>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:6>", "<empty>"}}), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:2>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "0"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:8>", "<sample:13>", "<sample:1>"}, false), new String[][]{{"findTypeParameters", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null]] {getErasedSignature=Ljava/lang/Object;, g...#581#1335196216", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:6>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.util.List] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List;, getTypeName=[simple type, class java.util.List], hasGenericTypes=false, hasValueHandler=...#426#-1529791547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>", "<null>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, null -> null] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignat...#567#-2071945399", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:2>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>", "<empty>", "<null>"}, false, 6, new String[][]{}), new String[][]{{"getTypeHandler", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Object;>;, getTypeName=[col...#522#-835137688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>", "<sample:0>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:12>", "<sample:9>", "<sample:3>"}}), new String[][]{{"containedTypeName", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>", "<null>"}, false), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:11>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", ";TISLE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:4>", "<null>"}}), new String[][]{{"isAbstract", "", "6"}, {"getErasedSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/Collection;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:9>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:2>", "<sample:3>"}}), new String[][]{{"toCanonical", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String<java.lang.Object,java.lang.Object>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{"-91"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "shot1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<sample:10>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:8>", "<sample:3>", "<null>", "<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>", "<sample:8>"}}), new String[][]{{"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:6>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:9>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[collection type; class java.util.Collection, contains [simple type, class java.lang.Object]]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class int, [simple type, class java.lang.Object] -> [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains null]] {getErasedSignature=I, ...#580#-2006369691", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "1.5e300Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<empty>", "<sample:2>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:8>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", "nullStrange Reference type "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:9>", "<null>", "<sample:8>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "Strange Collection tyoe a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:8>", "<sample:4>", "<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "2"}, {"getKeyType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"getReferencedType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", new String[]{"java.lang.Class"}, new String[]{"<sample:14>"}, false, 4, new String[][]{}), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "2"}, {"insert", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1sampleLjava/util/ArrayList;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false), new String[][]{{"getParameterSource", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:9>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<sample:2>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("null {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=null, hasGenericTypes=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollec...#375#1239190620", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_newSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:1>", "<sample:0>", "<null>"}, false, 7, new String[][]{}), new String[][]{{"getBindings", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:15>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:11>", "<sample:10>", "<sample:10>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_unknownType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:11>", "<sample:1>", "<sample:13>", "<empty>"}}), new String[][]{{"withStaticTyping", "", "5"}, {"useStaticType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:5>", "<sample:2>", "<sample:7>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>", "<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<empty>", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:12>", "<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[[simple type, class java.lang.Iterable<java.lang.Object>]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<null>", "<sample:4>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:5>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:3>"}}), new String[][]{{"getGenericSignature", "", "3"}, {"isThrowable", "", "7"}, {"isTypeOrSubTypeOf", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:10>", "<sample:1>", "<sample:4>"}}), new String[][]{{"getTypeHandler", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>"}, false), new String[][]{{"getErasedSignature", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:3>", "<sample:0>"}}), new String[][]{{"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[collection-like type; class int, contains [simple type, class int]]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "inta b"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "1"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:10>", "<sample:7>", "<empty>"}}), new String[][]{{"getInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains null] -> [reference type, class generated.algorithm.SearchInputFact...#715#292463898", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class java.lang.String]]] {getErasedSignature=[[Ljava/lang/String;, getGenericSignature=[[Ljava/lang/String;, getTypeName=[array...#521#-952279130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"containedTypeOrUnknown", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:9>"}}), new String[][]{{"isAbstract", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:9>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:1>"}}), new String[][]{{"isContainerType", "", "1"}, {"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "cha;", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}}), new String[][]{{"getValueHandler", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<empty>", "<sample:8>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:12>", "<sample:0>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:12>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:10>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"containedTypeOrUnknown", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:4>"}}), new String[][]{{"getBindings", "", "5"}, {"getTypeParameters", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:9>"}, false, 4, new String[][]{}), new String[][]{{"containedTypeCount", "", "3"}, {"containedTypeName", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:8>", "<sample:7>", "<sample:6>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:7>", "<sample:11>", "<sample:3>", "<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:15>", "<sample:10>", "<sample:0>", "<sample:1>"}}), new String[][]{{"withTypeHandler", "java.lang.Object", "4"}, {"getInterfaces", "", "2"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:1>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.String]] {getErasedSignature=[Ljava/lang/String;, getGenericSignature=[Ljava/lang/String;, getTypeName=[array type, component type: [simple t...#489#-574495179", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:16>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "getClassLoader", ""}}, 2), new String[][]{{"hasRawClass", "java.lang.Class", "4"}, {"isCollectionLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:11>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:8>", "<sample:0>"}}, 2), new String[][]{{"getInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("[[simple type, class java.io.Serializable]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:10>", "<sample:1>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 2), new String[][]{{"isEnumType", "", "7"}, {"isThrowable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<sample:8>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<empty>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>", "<sample:13>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "1xx1F"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:10>", "<sample:15>", "<null>"}}, 1), new String[][]{{"containedTypeOrUnknown", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:1>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:0>", "<sample:0>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:13>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:14>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:14>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:13>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.Type", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:14>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"containedTypeName", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "{\"a\":1}0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"-1.5010"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:6>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:13>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:11>", "<sample:2>", "<sample:0>", "<sample:4>"}, false), new String[][]{{"hasRawClass", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:1>", "<sample:5>"}}, 2), new String[][]{{"hasValueHandler", "", "3"}, {"getInterfaces", "", "0"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:17>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:8>", "<sample:7>", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:2>", "<null>"}}, 3), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedTypeName", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:13>", "<sample:4>", "<sample:2>"}}), new String[][]{{"getReferencedType", "", "7"}, {"containedType", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:12>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 3), new String[][]{{"getSuperClass", "", "7"}, {"hasValueHandler", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:8>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:5>", "<sample:2>"}}), new String[][]{{"containedTypeName", "int", "7"}, {"getContentTypeHandler", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:14>"}}, 2), new String[][]{{"constructRawMapLikeType", "java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
