package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, class java.lang.Integer, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:false>", "\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:key>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"Z"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.String, class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"[a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<null>", "<empty>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"B"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("byte", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "-0.0LS"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0LS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<empty>", "<null>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "3P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"[]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "aba,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aba,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"boolean[]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Z {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], get...#535#-83576801", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:0>", "int"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:14>"}, true, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "5"}, {"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"[L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:43>", "1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.String, class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:0>", "TTitle;i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1\r.26"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "{\"aa\":1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"S"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("short", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:3.0>", "long"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Double", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", "5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "1LTITLE", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:1.458>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:\tkeyo>", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<empty>", "UITLE", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoSuchMethodException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"2147483648PT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, class java.lang.Integer, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:2>", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"11.26"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"char.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("char", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"trimToSize", "", "1"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:0>", "La,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"/a/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"a "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, class java.lang.Integer, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"aaaJaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"[a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"Title;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"booleandouble"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"contains", "java.lang.Object", "4"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"K"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[interface java.io.Serializable, interface java.lang.Comparable, interface java.lang.CharSequence]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:1.5>", "<a>b</a>12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Double", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true), new String[][]{{"add", "java.lang.Object", "0"}, {"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$SubList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<empty>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"5.", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"iterator", "", "4"}, {"next", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"0I02020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0I02020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:1>", "020-1-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<null>", "char", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:2>", "i"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cTITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com/a?b=cTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:7>"}, true), new String[][]{{"listIterator", "", "2"}, {"nextIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<sample:2>", "F", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoSuchMethodException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{";"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1.5300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"chatr"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("chatr", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<empty>", "", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"/a0a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a0a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"float"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("float", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"Tit"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tit", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, interface java.util.List]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"="}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"0F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"boomeamdouble"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("boomeamdouble", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"Tjtle;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tjtle;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.123"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1E-5double1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:2.04>", "1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Double", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:ke>", "1.25long"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("List", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"nulT"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, int, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"o.5e300float"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "intdouble1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("intdouble1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"addAll", "java.util.Collection", "2"}, {"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:2>", ".f["}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "[1,2y]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "6"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"booleandouble", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Map", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<null>", "[1,2]"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"byte"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("byte {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=byte, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#1168287507", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"char"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFi"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"remove", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:a>", "chaar"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[e]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "123456789012345678901234567890Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaa8aaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaa8aaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"010-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010-0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<sample:3>", "1.12345678", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoSuchMethodException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.util.List, class java.lang.Integer, class [Ljava.lang.String;]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:2>", "1234567890123456789012345678901.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[a"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"-.1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"\rint"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, interface java.util.List]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"set", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.io.Serializable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.io.Serializable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#388#2001933646", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "1e1/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("List", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "char", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"htttp://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htttp://example", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"a,b,c1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", "-1long"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"["}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"Title;1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title;1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<empty>", "-1.51.5e300", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoSuchMethodException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaXaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"double"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("double {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecla...#350#-1889729549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"3P"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"boolean", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("boolean {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#352#-1058557127", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "0x123456689"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[interface java.util.Collection, interface java.lang.Iterable]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "boolean", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("boolean {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#352#-1058557127", SearchInputFactory_scaffolding.observe(actual));
 }
}
