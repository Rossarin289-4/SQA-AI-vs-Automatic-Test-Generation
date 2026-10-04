package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:3>", "0xFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:key>", "-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<null>", "<empty>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:2>", "double"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("double {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=double, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDecla...#350#-1889729549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:>", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:key>", "1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<empty>", "<null>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:0>", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.util.List, class java.lang.Integer, class [Ljava.lang.String;]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer, class java.lang.String, class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "0[/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0[/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:7>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:11>", "<null>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"[S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("short[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("][]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "1.183456789012234566S7boolean"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.183456789012234566S7boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "[]", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[interface java.util.List, interface java.util.Collection, interface java.lang.Iterable, interface java.util.RandomAccess, interface java.lang.Cloneable, interface java.io.Serializable]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"[L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"char[]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [C {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#532#-2083058414", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"doube"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:3>", "0xFFFFFFFF"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"2020-Z2-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-Z2-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:71:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:71:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", ",0TcTE1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:1.5>", "fl"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Double", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:0>", "fl"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<sample:3>", " "}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:-2147483648>", "1.1224567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, int, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class java.lang.Number, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"T"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"tque"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<null>", "<empty>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<null>", "+i6", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<null>", ",j5", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.45d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("45d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.f45d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f45d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.f4d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f4d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1-f4d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-f4d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"0-f4d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-f4d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:-1>", "short"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"]", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"\\bopk0an", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"float", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("float {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=float, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1908465553", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"short"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("short {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=short, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1867463505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class java.lang.Number, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("List", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"double"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPublicMethod", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Class[]"}, new String[]{"<sample:0>", "J", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoSuchMethodException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"int"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"1.1234568"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"01E5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01E5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"0EE5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0EE5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"0EEE5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0EEE5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"0EFE5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0EFE5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("short", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericBase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, int, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[int]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "2020-02-30T25:61:61", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "long", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("long {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#512085651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, class java.lang.Integer, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class[]", "java.lang.Class[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"null"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"Hello, World", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("List", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable, interface java.io.Serializable]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"+2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.45d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("45d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1-f4d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-f4d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:1.5>", "-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Double", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"short", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("short {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=short, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1867463505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"char"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"short"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("short {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=short, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclare...#348#1867463505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:0>", "D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrappersToPrimitives", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Number", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Comparable", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Map", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassesToClassNames", new String[]{"java.util.List"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Comparable", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"long"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("long", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"lnng"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lnng", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:-524226>", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "h"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "h2020-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "h2020-0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", "hh2020-0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String"}, new String[]{"<empty>", "char"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("List", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Comparable", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Map", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", "\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"indexOf", "java.lang.Object", "2"}, {"listIterator", "", "3"}, {"set", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String[]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class java.lang.Number, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"add", "java.lang.Object", "3"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.String"}, new String[]{",-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<null>", "1E5", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.ClassLoader", "java.lang.String", "boolean"}, new String[]{"<null>", "long", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("long {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=long, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#512085651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<i:1>", "Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isAssignable", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<empty>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:>", "5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"long"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("long", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"lng"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lng", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"1.12245678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12245678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Map", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"[]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageCanonicalName", new String[]{"java.lang.String"}, new String[]{"1b1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<b:true>", "[1+2]1e112,30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "isInnerClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<null>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllInterfaces", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String", "boolean"}, new String[]{"boolean", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("boolean {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=boolean, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDec...#352#-1058557127", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "convertClassNamesToClasses", new String[]{"java.util.List"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortClassName", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:b>", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("String", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "wrapperToPrimitive", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"S"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getShortCanonicalName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SearchInputFactory_scaffolding.GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitiveToWrapper", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getPackageName", new String[]{"java.lang.String"}, new String[]{";"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class java.lang.Integer, class java.lang.String, class java.lang.Integer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "toClass", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, class java.lang.Integer, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "primitivesToWrappers", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.util.List, class java.lang.Integer, class [Ljava.lang.String;]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getClass", new String[]{"java.lang.String"}, new String[]{"[S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [S {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=short[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDe...#533#-281393422", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.ClassUtils", "org.apache.commons.lang.ClassUtils", "getAllSuperclasses", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"add", "int,java.lang.Object", "3"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
}
