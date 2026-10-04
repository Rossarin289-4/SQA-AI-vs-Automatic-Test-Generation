package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>, T[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<s:>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<null>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>", "<sample:2>"}, true), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"get", "java.lang.Object", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<d:1.5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:10>"}, true), new String[][]{{"put", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:10>"}, true), new String[][]{{"put", "java.lang.Object,java.lang.Object", "0"}, {"put", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:12>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:14>", "<sample:2>"}, true), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "0"}, {"containsKey", "java.lang.Object", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "4"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{T=class java.lang.String}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"getAnnotationsByType", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<sample:1>"}, true), new String[][]{{"keySet", "", "5"}, {"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>, T[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<sample:2>"}, true), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true), new String[][]{{"size", "", "6"}, {"clear", "", "1"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:2>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true), new String[][]{{"putAll", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, true), new String[][]{{"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[T=class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getBounds", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<empty>"}, true), new String[][]{{"get", "java.lang.Object", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<empty>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getAnnotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "5"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true), new String[][]{{"get", "java.lang.Object", "0"}, {"get", "java.lang.Object", "5"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true), new String[][]{{"keySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"values", "", "7"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"isAnnotationPresent", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<s:a>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getName", "", "1"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"get", "java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{T=class java.lang.String}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object, T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:10>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getAnnotatedBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.AnnotatedType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}, {"remove", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"getAnnotationsByType", "java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"entrySet", "", "0"}, {"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>"}, true), new String[][]{{"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"get", "java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"putAll", "java.util.Map", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"containsValue", "java.lang.Object", "4"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}, {"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "2"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true), new String[][]{{"getAnnotation", "java.lang.Class", "4"}, {"getDeclaredAnnotationsByType", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"containsValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isAssignable", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>, T[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "3"}, {"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[class java.lang.String]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitUpperBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"clone", "", "1"}, {"containsKey", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:15>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:12>", "<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"putAll", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"containsValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitBounds", new String[]{"java.lang.reflect.TypeVariable"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:2>", "<sample:8>"}, true, 0, null, 1), new String[][]{{"containsValue", "java.lang.Object", "1"}, {"containsValue", "java.lang.Object", "6"}, {"remove", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isArrayType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{T=class java.lang.Object}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:12>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "typesSatisfyVariables", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getRawType", new String[]{"java.lang.reflect.Type", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "determineTypeArguments", new String[]{"java.lang.Class", "java.lang.reflect.ParameterizedType"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"getAnnotation", "java.lang.Class", "1"}, {"getDeclaredAnnotations", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "isInstance", new String[]{"java.lang.Object", "java.lang.reflect.Type"}, new String[]{"<i:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.ParameterizedType"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"keySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getTypeArguments", new String[]{"java.lang.reflect.Type", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "normalizeUpperBounds", new String[]{"java.lang.reflect.Type[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getImplicitLowerBounds", new String[]{"java.lang.reflect.WildcardType"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[], class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, class java.lang.Object]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.reflect.TypeUtils", "org.apache.commons.lang3.reflect.TypeUtils", "getArrayComponentType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"getGenericDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
}
