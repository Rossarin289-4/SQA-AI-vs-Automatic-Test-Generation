package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-32"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "1"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"18014398509481984"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "10", "-15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-64"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-1", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "266", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147467263", "-44"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-1879048192"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"33"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "2147483647", "511"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-2251799813685249"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "16352"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-37"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:4>", "2147483647", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "-1073741824"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-40"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1073741824", "60"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "2"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"56"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "18014398509481984"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "2047"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"2"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:1>", "-1", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-2"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "20"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:6>", "-1", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "-1", "1023"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:4>", "-2147483648", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:3>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-46"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483612", "32767"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-9", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-4"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "0", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-83"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-1099511627813"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1073741823", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1099511627777"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-37"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-34359738367"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "-10", "-33"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"8"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854773760"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1048576"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-22"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "-1", "-116"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "1", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:7>", "-3", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"51"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "2097152"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223369837831520256"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1125899906842623"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "144115188075855824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "2147483647", "-4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "0"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-14"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "2097172", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "0"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "268435416"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "0", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:4>", "2147483647", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
