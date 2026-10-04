package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "unregister", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:key>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384664098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"10", "1", "<null>", "false", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short[]"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<null>"}}), new String[][]{{"appendSuper", "int", "2"}, {"append", "byte", "3"}, {"append", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"1", "0", "<d:1.5>", "false", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"1", "-1", "<s:b>", "true", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-15", "<s:>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483423", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<null>"}}, 2), new String[][]{{"append", "short[]", "5"}, {"toHashCode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1178852936", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-127"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short", "-32751"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14177", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<sample:1>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short[]", "<sample:1>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "-69631"}}), new String[][]{{"append", "float[]", "1"}, {"append", "byte[]", "7"}, {"append", "java.lang.Object[]", "7"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292730358", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<sample:4>"}}, 3), new String[][]{{"append", "double[]", "3"}, {"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2116670118", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float", "-1.0"}}), new String[][]{{"append", "float", "4"}, {"append", "long[]", "5"}, {"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1008814263", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<sample:2>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "1099511662601"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<null>"}}, 3), new String[][]{{"appendSuper", "int", "2"}, {"append", "short", "1"}, {"append", "byte", "0"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("314593453", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"-32751"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:2>"}}, 3), new String[][]{{"append", "short[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"-32751"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char", "\000"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"append", "short[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"-32763"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<sample:2>"}}, 3), new String[][]{{"append", "short[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 7, new String[][]{}, 3), new String[][]{{"append", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 7, new String[][]{}, 3), new String[][]{{"append", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{"\000"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:3>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:3>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:-2192>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1563", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:-1050768>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1050139", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:1>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("928182", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("929551", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:]2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36639916", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"10", "1", "<null>", "true", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"25", "-127", "<i:2>", "true", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3173", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"50", "-127", "<i:2>", "false", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "9223372036854775807"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{"0"}, false, 0, null, 3), new String[][]{{"append", "char", "6"}, {"append", "short[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"-2147483648", "2147483647", "<i:2>", "true", "<null>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483647", "<i:1>", "true", "<empty>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2145386495", "2147483647", "<i:1>", "true", "<empty>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386495", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2145386495", "2147483647", "<i:0>", "true", "<empty>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097153", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483647", "<i:0>", "true", "<empty>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"1073741823", "2147483647", "<i:0>", "true", "<null>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741825", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"536870911", "2147483647", "<i:0>", "false", "<null>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1610612737", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"268435455", "2147483647", "<i:0>", "false", "<null>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879048193", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"0.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"-0.0"}, false, 15, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<sample:0>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<empty>"}}, 1), new String[][]{{"append", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:{ey>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1414650674", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:{e>>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1414569903", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:{e+>>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("798601330", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<i:1>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double", "4.000000000000001"}}, 1), new String[][]{{"append", "char[]", "3"}, {"append", "short[]", "0"}, {"append", "java.lang.Object[]", "3"}, {"append", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483601", "<s:ley>", "false", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1401351927", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"-2233365676476596372"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte", "-1"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "36028797018964991"}}, 3), new String[][]{{"append", "int[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "register", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<empty>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "false"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"1072693280", "1073741801", "<s:hmT>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"-1072693229", "2147483647", "<s:hhnT>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1072693255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"1072693165", "2147483647", "<s:hhnT>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072693139", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"-1072693165", "2147483647", "<s:ihnT>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1074790456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"-1072693165", "2147483647", "<s:ihnU>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1074790457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int"}, new String[]{"70"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double[]", "<sample:0>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<null>"}}, 1), new String[][]{{"append", "float", "2"}, {"append", "int[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte"}, new String[]{"-128"}, false, 0, null, 3), new String[][]{{"append", "boolean[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:}>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1032226", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384664098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:keX>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384618921", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("37418877", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"-127", "25", "<s:>", "true", "<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-79375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"-127", "536870937", "<s:>", "true", "<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073662449", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "unregister", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "unregister", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:C>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("952824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:D>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("954193", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-6>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("623", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-12>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("617", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-2147483648>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483019", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 2), new String[][]{{"append", "short[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<sample:2>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte"}, new String[]{"-52"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "0"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short", "16383"}}, 2), new String[][]{{"append", "long[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4788762", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26901", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35737745", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"-32768"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"32767"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:0>"}}), new String[][]{{"append", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short"}, new String[]{"-32751"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<sample:0>"}}), new String[][]{{"append", "short[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"4095"}, false), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"69631"}, false), new String[][]{{"append", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:-3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("626", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:-3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("626", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:ke>>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384583327", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:keH>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384597017", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:\rey>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1208492964", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:\rex>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1208491595", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<empty>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:\014ey>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1206618803", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:\rEx>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1206870699", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"25", "-127", "<i:2>", "true", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3173", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"10", "-2147483648", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"131097", "-127", "<i:2>", "true", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16649317", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"131097", "-63", "<i:2>", "true", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8259109", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"131097", "-1", "<i:2>", "true", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-131095", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "9223372036854775807"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("631", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("627", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:ae>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36912347", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:\ne>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32505536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:1\ne>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1271325957", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:17e>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1273605342", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:7e>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34784921", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "register", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "register", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"-2147483648", "2147483647", "<i:2>", "true", "<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483647", "<i:0>", "true", "<empty>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"1073741823", "2147483647", "<i:0>", "true", "<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741825", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<sample:0>"}}), new String[][]{{"append", "java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char", "a"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short", "-32768"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:{>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1029488", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:8{>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34865692", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:8<{>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1287007852", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:f<{>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1373219258", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<d:1.5>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073218165", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:key>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384664098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:{ey>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1414650674", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<sample:1>"}}), new String[][]{{"append", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double", "1.0"}}), new String[][]{{"append", "char[]", "2"}, {"append", "int", "0"}, {"append", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2145386495", "2145386495", "<s:key>", "true", "<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1365245824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2145386495", "<s:key>", "false", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1367342976", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483647", "<s:key>", "false", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483520", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483601", "<s:key>", "false", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1406231608", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class", "java.lang.String[]"}, new String[]{"2147483647", "2147483601", "<s:ley>", "false", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1401351927", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 11, new String[][]{}), new String[][]{{"append", "byte", "4"}, {"append", "boolean[]", "5"}, {"append", "int[]", "6"}, {"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1184642452", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 11, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<null>"}}), new String[][]{{"append", "byte", "4"}, {"append", "boolean[]", "5"}, {"append", "int[]", "6"}, {"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1376856816", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 11, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long[]", "<sample:2>"}}), new String[][]{{"append", "byte", "4"}, {"append", "boolean[]", "5"}, {"append", "int[]", "6"}, {"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1547441243", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte", "-1"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "isRegistered", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short[]", "<sample:2>"}}), new String[][]{{"append", "int[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<null>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:1.5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073218165", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:0.75>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072169589", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386521", "-1", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386521", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386529", "-1", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386529", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386529", "25", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("836784273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386589", "25", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("836821773", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386589", "2145386495", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1759510435", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386589", "2145386495", "<s:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-369098794", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object"}, new String[]{"2145386589", "2147483647", "<s:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097109", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:-22>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "2147483623"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147461322", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "2147483623"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147461300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:J>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "2147483623"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147461226", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float", "-0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:-1.5>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1074265483", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:3.0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1074266741", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:key>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384664098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:ey>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("37142339", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float", "0.0"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", ""}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", ""}}), new String[][]{{"append", "char", "3"}, {"toHashCode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("677", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1074789771", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:3>"}, false), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146435701", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:1>"}, false), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072716521", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"toHashCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1746740141", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "byte", "-128"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("501", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "isRegistered", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 1), new String[][]{{"append", "java.lang.Object[]", "3"}, {"append", "short[]", "5"}, {"append", "boolean[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2), new String[][]{{"append", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"append", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "short", "-8148"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"1", "-1", "<d:1.5>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"2147483647", "-1", "<s:b>", "true", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"2147483647", "1", "<s:b>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483551", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean", "java.lang.Class"}, new String[]{"2147483647", "1", "<i:0>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double[]", "<sample:0>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "false"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "2145386495"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double[]", "<sample:0>"}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112515862", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "double[]", "<sample:0>"}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112515863", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:9>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("686", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:[9>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3507", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:[8>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3506", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:hZ8>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "hashCode", ""}}, 2), new String[][]{{"toHashCode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("103419", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:1>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-137>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("492", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-34>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("595", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-536870923>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870294", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:536870923>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536871552", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:1073741846>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073742475", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:kkey>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-296638371", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "appendSuper", "int", "50"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:0>"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<sample:1>"}}, 3), new String[][]{{"append", "int[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146621213", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<null>"}}), new String[][]{{"append", "short", "1"}, {"append", "int", "5"}, {"toHashCode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31904510", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<empty>"}}), new String[][]{{"append", "short", "1"}, {"append", "int", "5"}, {"toHashCode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("904874", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"char"}, new String[]{"\037"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "java.lang.Object[]", "<empty>"}}), new String[][]{{"append", "short", "1"}, {"append", "int", "5"}, {"toHashCode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("903505", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2), new String[][]{{"append", "java.lang.Object", "3"}, {"append", "boolean[]", "5"}, {"append", "byte[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int"}, new String[]{"171"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean[]", "<sample:0>"}}, 3), new String[][]{{"append", "java.lang.Object", "3"}, {"append", "boolean[]", "5"}, {"append", "byte[]", "3"}, {"append", "long[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:D>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("954193", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-15>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("614", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993894", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("631", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:Aa>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35285975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"50", "0", "<s:>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"1073741823", "-15", "<s:>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741599", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"1073741823", "7", "<s:>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741775", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"1073741823", "7", "<s:_>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073737512", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"1073741823", "-8388601", "<s:_>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1887441112", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"1073741823", "-8388601", "<s:b>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535119723", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"536870911", "-8388601", "<s:b>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2071990635", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"268435455", "-8388601", "<s:b>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192942443", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"long"}, new String[]{"-36028797018963920"}, false, 7, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "true"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "toHashCode", ""}}, 2), new String[][]{{"append", "java.lang.Object", "5"}, {"append", "long", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:1>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:0>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:-2147483648>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483019", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<b:true>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1860", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<b:false>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1866", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1384664098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<sample:0>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:-1>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("628", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:0>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:a>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("993894", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<i:2>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("631", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:ah>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36916454", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:a,>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36834314", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object", "boolean"}, new String[]{"<s:1,>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34402970", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073218165", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"short[]"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"appendSuper", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "unregister", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "float[]", "<null>"}}), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31860785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<null>"}, false), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("861149", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<empty>"}, false), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23321", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"int"}, new String[]{"25"}, false), new String[][]{{"append", "double", "2"}, {"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1788467151", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-222050219", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-745724963", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"float[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{}), new String[][]{{"append", "float", "2"}, {"append", "char", "3"}, {"toHashCode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("328016861", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "false"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:1>"}}, 1), new String[][]{{"append", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.builder.HashCodeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "boolean", "false"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:1>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1178323349", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:1>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29462656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:3>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("792651", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:2>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1087571747", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "int", "-50"}, {"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:2>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1087571748", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:2>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34293266", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.apache.commons.lang3.builder.HashCodeBuilder", "append", "char[]", "<sample:2>"}}, 1), new String[][]{{"toHashCode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34293265", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-127", "<i:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483519", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-127", "<i:-2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483523", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-127", "<i:-4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483525", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-127", "<i:-1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483522", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.builder.HashCodeBuilder", "org.apache.commons.lang3.builder.HashCodeBuilder", "reflectionHashCode", new String[]{"int", "int", "java.lang.Object", "boolean"}, new String[]{"2147483647", "-127", "<i:48>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483473", String.valueOf(actual));
 }
}
