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
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=false, isCollectionOrArray=false, isEnum=false, isPrimitive=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=false, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:0>"}, true), new String[][]{{"isEnum", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:4>"}, true), new String[][]{{"getActualType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.ParameterizedTypeImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getActualType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"isArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:4>"}, true), new String[][]{{"getWrappedClass", "", "6"}, {"getRawClass", "", "1"}, {"getWrappedClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:1>"}, true), new String[][]{{"getRawClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=false, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<empty>"}, true), new String[][]{{"isPrimitive", "", "1"}, {"isPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:7>"}, true), new String[][]{{"isCollectionOrArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:4>"}, true), new String[][]{{"getRawClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isCollectionOrArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getActualType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.ParameterizedTypeImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=false, isCollectionOrArray=false, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:10>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getRawClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getActualType", "", "1"}, {"getOwnerType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getWrappedClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getRawClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"getWrappedClass", "", "5"}, {"isEnum", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 1), new String[][]{{"getWrappedClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfo", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfoArray", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:15>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true), new String[][]{{"getRawClass", "", "1"}, {"isEnum", "", "4"}, {"getComponentRawType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true), new String[][]{{"isArray", "", "5"}, {"isArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfoArray", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForField", new String[]{"java.lang.reflect.Field", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getActualType", "", "0"}, {"getRawType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2), new String[][]{{"getActualType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true), new String[][]{{"getActualType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 3), new String[][]{{"isEnum", "", "3"}, {"getComponentRawType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true), new String[][]{{"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1), new String[][]{{"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfoArray", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1), new String[][]{{"getActualType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 3), new String[][]{{"isPrimitive", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2), new String[][]{{"isEnum", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 3), new String[][]{{"getWrappedClass", "", "5"}, {"getActualType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.TypeInfoArray", actual.getClass().getName());
  assertEquals("{isArray=true, isCollectionOrArray=true, isEnum=false, isPrimitive=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 3), new String[][]{{"isArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1), new String[][]{{"getWrappedClass", "", "0"}, {"isCollectionOrArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2), new String[][]{{"getSecondLevelType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1), new String[][]{{"getWrappedClass", "", "0"}, {"getActualType", "", "1"}, {"getSecondLevelType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.TypeInfoFactory", "com.google.gson.TypeInfoFactory", "getTypeInfoForArray", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2), new String[][]{{"isArray", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
