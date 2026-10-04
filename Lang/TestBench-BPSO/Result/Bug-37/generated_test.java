package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"byte[]", "byte"}, new String[]{"<null>", "127"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"short[]", "short"}, new String[]{"<sample:2>", "32767"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true, false, true, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"double[]", "double", "double"}, new String[]{"<sample:0>", "Infinity", "-0.7499999999999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"float[]", "float"}, new String[]{"<sample:1>", "1.5"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "remove", new String[]{"long[]", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toString", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"int[]", "int"}, new String[]{"<sample:1>", "5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<empty>", "<i:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toMap", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:0>", "1", "-63"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"char[]", "char[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Integer[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"int[]", "int"}, new String[]{"<sample:2>", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:5>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"float[]", "float"}, new String[]{"<sample:1>", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Byte;", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"float[]", "float"}, new String[]{"<null>", "-2.6"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]", "float"}, new String[]{"<sample:3>", "1.7014117E38"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"float[]", "float"}, new String[]{"<sample:0>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"double[]", "double", "int", "double"}, new String[]{"<sample:0>", "49.0", "-132", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int", "double"}, new String[]{"<null>", "-9.999999999999998", "-226", "0.031"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"byte[]", "byte"}, new String[]{"<sample:7>", "-44"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"double[]", "int", "double"}, new String[]{"<sample:2>", "2147418111", "98.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"long[]", "long", "int"}, new String[]{"<empty>", "-2", "-226"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"int[]", "int"}, new String[]{"<sample:1>", "40"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 40]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"float[]", "float", "int"}, new String[]{"<empty>", "Infinity", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"short[]", "short"}, new String[]{"<sample:2>", "-43"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[32767, 2, 3, -43]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"short[]", "short"}, new String[]{"<sample:2>", "-43"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"float[]", "float"}, new String[]{"<sample:1>", "-3.4028235E38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"int[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"short[]"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"long[]", "long"}, new String[]{"<null>", "-1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"double[]", "double"}, new String[]{"<null>", "0.97"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double"}, new String[]{"<null>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-24>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2, -24]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameType", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-40>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:1>", "<i:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"long[]", "long"}, new String[]{"<sample:0>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "double"}, new String[]{"<sample:1>", "-1.4999999999999998", "-6.45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int", "double"}, new String[]{"<sample:2>", "1.5000000000000002", "1342177282", "35.97"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:1>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"byte[]", "byte"}, new String[]{"<sample:7>", "-64"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Boolean;", actual.getClass().getName());
  assertEquals("[false, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"long[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"char[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"char[]", "int", "char"}, new String[]{"<sample:6>", "0", "P"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[P, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"double[]", "double", "double"}, new String[]{"<sample:0>", "-1.4999999999999996", "24.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"double[]", "double", "double"}, new String[]{"<empty>", "1.7976931348623157E308", "0.30999999999999994"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"long[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Long;", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "2.4504"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, 2.4504]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"java.lang.Object[]", "int", "java.lang.Object"}, new String[]{"<sample:3>", "-26", "<i:-134217727>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Long[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Short[]", "short"}, new String[]{"<empty>", "32767"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"boolean[]", "boolean[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"double[]", "int", "double"}, new String[]{"<sample:1>", "0", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"long[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "remove", new String[]{"char[]", "int"}, new String[]{"<null>", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"char[]", "char", "int"}, new String[]{"<sample:8>", "0", "536870913"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Boolean[]", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"char[]", "char"}, new String[]{"<sample:6>", "g"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"char[]"}, new String[]{"<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"boolean[]", "boolean"}, new String[]{"<empty>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"int[]", "int", "int"}, new String[]{"<sample:3>", "-2147417983", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"short[]", "int", "short"}, new String[]{"<sample:4>", "2", "-43"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[3, 4, -43]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"float[]", "float[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "clone", new String[]{"char[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"char[]", "char", "int"}, new String[]{"<sample:0>", "\037", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"char[]", "char"}, new String[]{"<sample:1>", "I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[2, 3, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:3>", "<s:key>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"float[]", "int", "int"}, new String[]{"<sample:5>", "8129", "-32"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"float[]", "float[]"}, new String[]{"<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"boolean[]", "boolean[]"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]", "double"}, new String[]{"<sample:0>", "6.45"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"char[]", "char"}, new String[]{"<sample:2>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"short[]", "short"}, new String[]{"<sample:0>", "16383"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"short[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"long[]", "long"}, new String[]{"<sample:1>", "70368744177665"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"char[]", "char"}, new String[]{"<null>", "\000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"long[]", "long"}, new String[]{"<null>", "-9223372036854775808"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"short[]", "short[]"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[-1, 32767, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"char[]", "char[]"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ , a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "0", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"boolean[]", "boolean[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[false, true, false, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"java.lang.Object[]", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<i:-134217677>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"short[]", "short", "int"}, new String[]{"<null>", "-32736", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"long[]", "long"}, new String[]{"<sample:7>", "2251804108652542"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "-2147417958", "-33"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"char[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Long[]", "long"}, new String[]{"<empty>", "-2147483625"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"long[]", "long"}, new String[]{"<sample:2>", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[1, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Integer[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"int[]", "int"}, new String[]{"<sample:6>", "1073709055"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"short[]", "short"}, new String[]{"<null>", "16383"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<null>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"float[]", "float", "int"}, new String[]{"<sample:3>", "-3.4028235E38", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"byte[]", "byte"}, new String[]{"<null>", "127"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"char[]", "char"}, new String[]{"<sample:1>", "`"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0, `]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"float[]", "float[]"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"int[]", "int", "int"}, new String[]{"<sample:6>", "-2", "-132"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"float[]"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"java.lang.Object[]", "java.lang.Object", "int"}, new String[]{"<sample:0>", "<i:2>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "-0.7499999999999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"char[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"long[]", "long[]"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"byte[]", "byte"}, new String[]{"<sample:1>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"char[]", "char[]"}, new String[]{"<sample:6>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, a, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Short[]", "short"}, new String[]{"<sample:2>", "32767"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[32767, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"int[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Integer;", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"int[]", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<null>", "-2147417950", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"short[]", "short"}, new String[]{"<null>", "-95"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"boolean[]", "int", "int"}, new String[]{"<null>", "-2147417952", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]", "float"}, new String[]{"<null>", "-1.7014117E38"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int"}, new String[]{"<sample:0>", "-1.4999999999999996", "-2097215"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Integer[]", "int"}, new String[]{"<null>", "-2147417950"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"double[]", "double", "int"}, new String[]{"<sample:4>", "0.0", "-452"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<null>", "<i:-134217727>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Long[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"short[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"boolean[]"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Integer[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEquals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<i:124>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"char[]", "char", "int"}, new String[]{"<sample:9>", "L", "-30"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"char[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Long[]", "long"}, new String[]{"<null>", "-2"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"short[]", "short"}, new String[]{"<sample:1>", "0"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[32767]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<sample:5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c, b, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Long[]", "long"}, new String[]{"<sample:1>", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"char[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Character;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"long[]", "long"}, new String[]{"<sample:1>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[0, 1, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"int[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"boolean[]", "boolean", "int"}, new String[]{"<sample:2>", "true", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"float[]", "int", "int"}, new String[]{"<sample:4>", "-1073709036", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127, 127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]", "double"}, new String[]{"<empty>", "49.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"short[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Short;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"double[]", "double"}, new String[]{"<sample:5>", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"char[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Character;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"boolean[]", "boolean[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[false, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"short[]", "short", "int"}, new String[]{"<sample:0>", "-2", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"byte[]", "byte", "int"}, new String[]{"<sample:5>", "127", "-26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"long[]", "long"}, new String[]{"<sample:0>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Short[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[32767, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[-1, 1.5, value]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"short[]", "short", "int"}, new String[]{"<sample:4>", "32767", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"boolean[]", "boolean[]"}, new String[]{"<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Integer[]", "int"}, new String[]{"<sample:1>", "1073709055"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"float[]", "float", "int"}, new String[]{"<sample:1>", "0.375", "-39"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Double;", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"boolean[]", "boolean"}, new String[]{"<null>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"int[]", "int[]"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"byte[]", "byte", "int"}, new String[]{"<null>", "127", "16777090"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "-510", "2145320831"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Boolean[]", "boolean"}, new String[]{"<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"int[]", "int[]"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"long[]", "long", "int"}, new String[]{"<sample:4>", "-4611686016279904279", "-66"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"short[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Short;", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"boolean[]", "boolean", "int"}, new String[]{"<sample:4>", "true", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toMap", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"char[]", "char[]"}, new String[]{"<null>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Short[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"float[]", "float"}, new String[]{"<sample:3>", "2.14748365E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"byte[]", "byte", "int"}, new String[]{"<sample:5>", "127", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int"}, new String[]{"<sample:5>", "1.0", "1073741803"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Byte[]", "byte"}, new String[]{"<sample:2>", "0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"int[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]", "char"}, new String[]{"<sample:2>", "O"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"int[]"}, new String[]{"<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Byte[]", "byte"}, new String[]{"<empty>", "-128"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"int[]", "int"}, new String[]{"<sample:2>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"boolean[]", "int", "int"}, new String[]{"<sample:1>", "536870913", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"int[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Integer;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "1342177151"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"boolean[]", "int", "int"}, new String[]{"<sample:6>", "2147418111", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-31", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"float[]", "int", "int"}, new String[]{"<null>", "2147483647", "536870913"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]", "double"}, new String[]{"<null>", "0.0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<sample:7>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[c, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Double[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Short[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"short[]", "short", "int"}, new String[]{"<sample:2>", "32767", "46"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:4>", "-66", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"boolean[]", "boolean", "int"}, new String[]{"<null>", "false", "-33554180"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"java.lang.Object[]", "java.lang.Object"}, new String[]{"<null>", "<s:a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"boolean[]", "boolean"}, new String[]{"<sample:9>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"float[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Float;", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:7>", "262121", "-65599"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"short[]", "int", "int"}, new String[]{"<sample:0>", "8388382", "469762019"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]", "float"}, new String[]{"<empty>", "-1.3"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int", "double"}, new String[]{"<sample:5>", "0.7499999999999999", "-16777090", "-6.45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]", "char"}, new String[]{"<null>", "2"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"float[]", "float"}, new String[]{"<null>", "-1.7014117E38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Boolean[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int"}, new String[]{"<sample:1>", "0.62", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"float[]", "float"}, new String[]{"<sample:2>", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double"}, new String[]{"<sample:6>", "-1.7976931348623157E308"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Character[]", "char"}, new String[]{"<empty>", ":"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"short[]", "short[]"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[32767, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"boolean[]", "boolean[]"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[false, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"char[]", "int", "int"}, new String[]{"<sample:8>", "-66", "-1075806188"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isEmpty", new String[]{"short[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"int[]", "int"}, new String[]{"<null>", "-1073741785"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"char[]", "char"}, new String[]{"<null>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"char[]", "char"}, new String[]{"<sample:8>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "clone", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"float[]", "float[]"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"boolean[]", "int", "int"}, new String[]{"<sample:6>", "-1075806188", "262084"}, true);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "contains", new String[]{"int[]", "int"}, new String[]{"<sample:3>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toObject", new String[]{"double[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Double;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[1, 9223372036854775807, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "toPrimitive", new String[]{"java.lang.Float[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"double[]", "double", "int", "double"}, new String[]{"<sample:2>", "-10.0", "2", "-0.7499999999999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"java.lang.Object[]", "int", "int"}, new String[]{"<sample:8>", "-452", "2097215"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[-1, 1.5, value]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:7>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "indexOf", new String[]{"double[]", "double", "double"}, new String[]{"<sample:2>", "-Infinity", "-8.988465674311579E306"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"double[]", "double[]"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "-1610612664", "26"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"short[]", "int", "int"}, new String[]{"<sample:5>", "-2097215", "1"}, true);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"boolean[]", "int", "boolean"}, new String[]{"<null>", "0", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"boolean[]", "boolean", "int"}, new String[]{"<sample:6>", "true", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameType", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "addAll", new String[]{"short[]", "short[]"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[S", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"short[]", "short[]"}, new String[]{"<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"char[]", "char"}, new String[]{"<sample:7>", "\000"}, true);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:6>", "536871036", "-2097215"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"java.lang.Object[]", "int", "java.lang.Object"}, new String[]{"<null>", "1342177282", "<i:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "lastIndexOf", new String[]{"java.lang.Object[]", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<null>", "536870938"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "subarray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:9>", "-226", "32782"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[J", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "add", new String[]{"java.lang.Object[]", "int", "java.lang.Object"}, new String[]{"<sample:5>", "2", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, a, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"java.lang.Object[]", "java.lang.Object[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"int[]", "int"}, new String[]{"<null>", "8388366"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "reverse", new String[]{"long[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"boolean[]", "boolean[]"}, new String[]{"<null>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "removeElement", new String[]{"byte[]", "byte"}, new String[]{"<sample:1>", "127"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", "isSameLength", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
