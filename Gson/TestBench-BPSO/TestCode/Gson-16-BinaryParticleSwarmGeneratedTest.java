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
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:1>", "<empty>", "<sample:0>"}, true), new String[][]{{"getTypeName", "", "3"}, {"getRawType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<empty>", "<sample:2>", "<empty>"}, true, 0, null, 2), new String[][]{{"getOwnerType", "", "7"}, {"getTypeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.75>", "<s:kex>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true), new String[][]{{"getGenericComponentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? {getLowerBounds=[], getTypeName=?, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>", "<sample:3>"}, true), new String[][]{{"getTypeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getTypeName", "", "5"}, {"getActualTypeArguments", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:8>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:12>", "<sample:2>"}, true), new String[][]{{"getTypeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String[]<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:8>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getLowerBounds=[generated.algorithm.SearchInputFactory_scaffolding$GenericB.., getTypeName=? super generated.a...#285#-707464823", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:15>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:18>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:24>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.util.List; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.List[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclar...#557#472915550", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:21>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? extends java.lang.Number {getLowerBounds=[], getTypeName=? extends java.lang.Number, getUpperBounds=[class java.lang.Number]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:15>", "<sample:21>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:21>", "<sample:21>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:27>", "<sample:15>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("int<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>> {getActualTypeArguments=[T, class generated.algo...#315#687118776", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:-2049>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2049", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:2>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getOwnerType", "", "5"}, {"getDeclaredAnnotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.String<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>> {getActualTypeArguments=[T, class g...#328#-286754729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:b9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3095", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getLowerBounds", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("int<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>> {getActualTypeArguments=[T, class generated.algo...#315#687118776", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.String<java.lang.Object, T> {getActualTypeArguments=[class java.lang.Object, T], getTypeName=java.lang.String<java.lang.Object, T>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:1>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:0>", "<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("int<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=int<java.lang.String>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.Object<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>> {getActualTypeArguments=[T, class g...#328#348261527", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:5>", "<sample:11>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"getTypeName", "", "1"}, {"getUpperBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:1>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:3a>", "<s:`>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:8>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:6>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getOwnerType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.Object[] {getTypeName=java.lang.Object[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<empty>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:6>", "<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<s:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getLowerBounds=[class generated.algorithm.SearchInputFactory_scaffolding$Ge.., getTypeName=? super generated.algorithm.SearchInp...#267#1822979729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getActualTypeArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.String<java.lang.Object, T> {getActualTypeArguments=[class java.lang.Object, T], getTypeName=java.lang.String<java.lang.Object, T>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:2>", "<empty>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:0.792>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1571064546", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"getLowerBounds", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super T {getLowerBounds=[T], getTypeName=? super T, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T<java.lang.Object, T>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<java.lang.String>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? {getLowerBounds=[], getTypeName=?, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:1>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getUpperBounds", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:5>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:1>", "<empty>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("int<generated.algorithm.SearchInputFactory_scaffolding$GenericSub> {getActualTypeArguments=[class generated.algorithm.SearchInputFactory_scaffolding$Ge.., getTypeName=int<generated.algorithm.SearchInp...#230#-565235095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:3>", "<sample:3>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("T {getActualTypeArguments=[], getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.String[] {getTypeName=java.lang.String[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:4>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? extends java.lang.String {getLowerBounds=[], getTypeName=? extends java.lang.String, getUpperBounds=[class java.lang.String]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.Object[] {getTypeName=java.lang.Object[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:3>", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>[] {getTypeName=generated.algorithm.SearchInputFactory_scaffolding$GenericBa..}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? extends generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getLowerBounds=[], getTypeName=? extends generated.algorithm.SearchInputFactory_scaffolding.., getUpperBounds=[class generated....#246#-1805938068", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, true), new String[][]{{"getRawType", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<empty>", "<sample:2>", "<empty>"}, true), new String[][]{{"getRawType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>"}, true), new String[][]{{"getActualTypeArguments", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, true), new String[][]{{"getActualTypeArguments", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("int<java.lang.Object, T> {getActualTypeArguments=[class java.lang.Object, T], getTypeName=int<java.lang.Object, T>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.lang.String<T, generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>> {getActualTypeArguments=[T, class g...#328#-286754729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3418", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("int[] {getTypeName=int[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:1>", "<empty>", "<empty>"}, true), new String[][]{{"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<empty>", "<sample:6>", "<sample:2>"}, true), new String[][]{{"getActualTypeArguments", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1231", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:11>", "<null>", "<sample:0>"}, true), new String[][]{{"getDeclaredAnnotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super T[] {getLowerBounds=[T[]], getTypeName=? super T[], getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[][] {getTypeName=T[][]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:1>", "<sample:1>"}, true), new String[][]{{"getDeclaredAnnotations", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072168960", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true), new String[][]{{"getUpperBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:6>", "<null>", "<sample:1>"}, true), new String[][]{{"getTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? extends T {getLowerBounds=[], getTypeName=? extends T, getUpperBounds=[T]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:0.37>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1161226682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:-54>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-54", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<null>", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true), new String[][]{{"getGenericComponentType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, true), new String[][]{{"getActualTypeArguments", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:2>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:3>", "<sample:2>"}, true), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>"}, true), new String[][]{{"getAnnotationsByType", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getLowerBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:8>", "<sample:3>"}, true), new String[][]{{"getBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<empty>", "<sample:6>"}, true), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, true), new String[][]{{"isAnnotationPresent", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:0>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:5>", "<sample:3>"}, true), new String[][]{{"getAnnotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true), new String[][]{{"getDeclaredAnnotation", "java.lang.Class", "4"}, {"getAnnotatedBounds", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.AnnotatedType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:0>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true), new String[][]{{"getTypeName", "", "7"}, {"getGenericComponentType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true), new String[][]{{"getTypeName", "", "7"}, {"getLowerBounds", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("? extends T[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:0>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"getTypeName", "", "7"}, {"getGenericComponentType", "", "6"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>", "<empty>"}, true, 0, null, 2), new String[][]{{"getTypeName", "", "6"}, {"getTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("E {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=E, getTypeName=E}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"getTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("? extends T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<empty>", "<sample:2>", "<empty>"}, true), new String[][]{{"getAnnotation", "java.lang.Class", "1"}, {"annotationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<null>", "<empty>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getTypeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true), new String[][]{{"getTypeName", "", "6"}, {"getUpperBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "checkNotPrimitive", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<empty>", "<null>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true), new String[][]{{"getTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("? extends java.lang.String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:3>", "<sample:1>", "<empty>"}, true, 0, null, 3), new String[][]{{"getDeclaredAnnotationsByType", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:1>", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equals", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"getTypeName", "", "0"}, {"getTypeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[][]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<empty>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, true, 0, null, 3), new String[][]{{"isAnnotationPresent", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getLowerBounds=[class generated.algorithm.SearchInputFactory_scaffolding$Ge.., getTypeName=? super generated.algorithm.SearchInpu...#266#385955994", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<null>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getActualTypeArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:ae>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3108", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("? super generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("E {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=E, getTypeName=E}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getGenericComponentType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "canonicalize", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"getTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true), new String[][]{{"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("? super java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub[] {getTypeName=generated.algorithm.SearchInputFactory_scaffolding$GenericSu..}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:0>", "<null>", "<empty>"}, true, 0, null, 3), new String[][]{{"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, true), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "subtypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? extends generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getLowerBounds=[], getTypeName=? extends generated.algorithm.SearchInputFactory_scaffolding.., getUpperBounds=[class generated....#246#-1805938068", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:5>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super java.lang.String {getLowerBounds=[class java.lang.String], getTypeName=? super java.lang.String, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("E {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=E, getTypeName=E}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:7>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super java.lang.Object {getLowerBounds=[class java.lang.Object], getTypeName=? super java.lang.Object, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"getUpperBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super T {getLowerBounds=[T], getTypeName=? super T, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:8>"}, true, 0, null, 1), new String[][]{{"getUpperBounds", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, true), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:7>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getCollectionElementType", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:15>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolveTypeVariable", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$WildcardTypeImpl", actual.getClass().getName());
  assertEquals("? super java.lang.Object {getLowerBounds=[class java.lang.Object], getTypeName=? super java.lang.Object, getUpperBounds=[class java.lang.Object]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:0>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:kew>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106077", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:1.558>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1468685744", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "newParameterizedTypeWithOwner", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type", "java.lang.reflect.Type[]"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getActualTypeArguments=[], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$GenericSu..}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:keyu>", "<i:-1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getRawType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"getLowerBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getGenericSupertype", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "arrayOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getGenericComponentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "getMapKeyAndValueTypes", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "supertypeOf", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "typeToString", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "hashCodeOrZero", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.$Gson$Types", "com.google.gson.internal.$Gson$Types", "resolve", new String[]{"java.lang.reflect.Type", "java.lang.Class", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:9>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String> {getActualTypeArguments=[class java.lang.String], getTypeName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#206#-295901449", SearchInputFactory_scaffolding.observe(actual));
 }
}
