package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[b, 2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[b, 2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key, 0, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[0, , true, c]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[, true, c, -1, 1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[c, -1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[c, -1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5, value, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[value, a, 1, b]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[a, 1, b, 2, key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[b, 2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key, 0, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[0, , true, c]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[, true, c, -1, 1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key, 0, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[0, , true, c]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[, true, c, -1, 1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[c, -1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5, value, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[value, a, 1, b]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[a, 1, b, 2, key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:fF>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, , true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c, -1, 1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[c, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1196", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073218733", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("961843472", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111972723", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, , true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5, value, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[value, a, 1, b]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[a, 1, b, 2, key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:2a>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c, -1, 1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[c, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-10"}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 7, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, , true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-524289"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c, -1, 1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-524289"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[c, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-524289"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-524272"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5, value, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-524272"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[value, a, 1, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("961843472", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111972723", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111972723", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"3848"}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[b, 2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "511"}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-33553921"}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1196", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073218733", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:ke>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "46"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"2147483615"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1196", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073218733", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("961843472", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1196", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073218733", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073217536", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c, -1, 1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[value, a, 1, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 1, b, 2, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[c, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5, value, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[key, 0, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("961843472", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111972723", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5, value, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[value, a, 1, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 1, b, 2, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 1, b, 2, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[key, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, , true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[1.5, value, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[value, a, 1, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:-16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[0, , true, c]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[, true, c, -1, 1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[c, -1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[1.5, value, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[value, a, 1, b]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MultiKey[a, 1, b, 2, key]", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-1"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[b, 2] {getKeys=[b, 2], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKeys", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 1, b, 2, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 15, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"2"}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key] {getKeys=[key], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[c, -1] {getKeys=[c, -1], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:cc>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:E>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 15, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-1073741824"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[key, 0, ] {getKeys=[key, 0, ], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 9, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "size", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5, value, a] {getKeys=[1.5, value, a], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKeys", ""}, {"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[0, , true, c] {getKeys=[0, , true, c], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[1.5] {getKeys=[1.5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 11, new String[][]{{"org.apache.commons.collections.keyvalue.MultiKey", "getKey", "int", "-2"}, {"org.apache.commons.collections.keyvalue.MultiKey", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.keyvalue.MultiKey", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[a, 1, b, 2, key] {getKeys=[a, 1, b, 2, key], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[, true, c, -1, 1.5] {getKeys=[, true, c, -1, 1.5], size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.keyvalue.MultiKey", "org.apache.commons.collections.keyvalue.MultiKey", "getKey", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "MultiKey[value, a, 1, b] {getKeys=[value, a, 1, b], size=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
