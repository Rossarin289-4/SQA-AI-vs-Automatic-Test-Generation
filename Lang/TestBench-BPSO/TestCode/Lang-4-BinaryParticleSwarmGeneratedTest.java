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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:/>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:adbc>", "1073741827", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/o>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:50>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "-82", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:00>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:adbT>", "2147483637", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:00>", "1073741822", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:00>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abc>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "35", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:2>", "1073741823", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:`>", "-2", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s://o>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/a/ao", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s::>", "2147483647", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:ac>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:u/>", "-38", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:d >", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}}), new String[][]{{"translate", "java.lang.CharSequence", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"268435457"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2080374784"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("84000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0_>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0a_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"536870913"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "0", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:->"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:/>", "-2147483648", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: >", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741827"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40000003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:I>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "4"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:00>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bdbc>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abadabac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "-16777206", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:{>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a,bc>", "<sample:0>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/p>", "<sample:4>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaabac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:00>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:00>", "2147483647", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:f0>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"462"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1CE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/9>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/a9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "20", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "2147483646", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a{c>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: d>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0{c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:/o>", "-10", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:\"00>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "-2147483648", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: AB>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-50"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFCE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a0>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483595"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000035", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"44"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "2147483647", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:!>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s://>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:adb>c>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0db>c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:1db+c>", "138", "<sample:4>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:W >"}}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741827"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40000003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s0mple", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:o/o>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a?>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:cabc>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c0bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:?a>", "2147483647", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:D.>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "1073741824", "<sample:1>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1073741827"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BFFFFFFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab\tc>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaba\tac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "1073741828", "<sample:2>"}}), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a&#115;a&#97;a&#109;a&#112;a&#108;a&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s: >"}}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483518"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFF7E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:/a>", "1", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:  >", "0", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s: >"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:/oc>", "1", "<sample:3>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:F>", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "2"}, {"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:adic>", "0", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a1>", "0", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:01>", "-46", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:m >", "536870913", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:n>", "<sample:2>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:_a>", "1", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:A/>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/>", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:/>", "73", "<sample:4>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:t/o>", "10", "<sample:3>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483639", "<sample:4>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "7"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/>", "<sample:4>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
