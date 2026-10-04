package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775789"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "10", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "10", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "10", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "10", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-43", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483612", "4194263"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-16"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "0", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "4611686018427387867"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "0", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "4611686018427387867"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "0", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2", "1"}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "-1", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427379672"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "65538", "1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"15"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"32"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-8"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1099511627774"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1099511627774"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"576460752303423550"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "-15"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "-2147483648", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-288230376151679018"}, false, 12, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-1"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "116"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-1", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775755"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-4611686018427387809"}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:4>", "0", "2147483647"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "-1"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "10", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "10", "1"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-1", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"4294967264"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:5>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "2"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "10", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 10, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "1", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<null>", "2147483647", "2147483647"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:2>", "1", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "0"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "0"}, false, 12, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "-1", "1"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<empty>"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 15, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-17", "2147483609"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "10", "2147483647"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<empty>", "-17", "2147483609"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:0>", "10", "2147483647"}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2", "1"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "2"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "-4611686018427387904"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "2147483647", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "2147483647", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 15, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[],int,int", "<sample:5>", "2147483647", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "0"}, false, 4, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}, {"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "1", "0"}, false, 11, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, false, 11, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "skip", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "3"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.ChecksumCalculatingInputStream", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getValue=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
}
