package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abhc>", "-2147483648", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:0abc>", "-2147483648", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abhlc>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:t>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#116;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:00>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483392"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:aahl>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a?>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#63;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"59"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aac;>", "2147483647", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\">"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#34;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\u00e9>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u00E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abgc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#103;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:-Da>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#45;&#68;&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abthlc>", "0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aa>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:E>", "0", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:la>", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147481600"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000800", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abhlc>", "-1", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:u>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abh\"c>", "12", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#117;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abhlc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#104;&#108;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abic>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abic", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abccc>", "0", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "2147483647", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:?>", "2147483647", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:33>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#98;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abd>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#98;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aabhlc>", "0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:}a>", "2147483647", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abbhc>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:ab:c>", "1", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-24"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFE8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "0", "<sample:0>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abhlc>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:k>", "67117056", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abbhcr>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#98;&#104;&#99;&#114;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a<hlc>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#84;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abhc>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061\\u0062\\u0063", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:HH>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0048\\u0048", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abbhlc>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abbhlc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:p>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aa>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:bc>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abb>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:n>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#110;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abhlc>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#104;&#108;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:06>", "524242", "<null>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "5"}, {"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0073\\u0061\\u006D\\u0070\\u006C\\u0065", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147467264"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80004000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483596"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFCC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abhlc>", "1", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abhlc>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:`>", "0", "<sample:5>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:d\t>", "<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"67108864"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2058"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ah>", "<sample:1>"}}), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}, {"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1069547520"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C0400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abhlc>", "<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2145386496"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "1"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aailc>", "0", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abhlc>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abhlPc>", "-2147483648", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:u}aa>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abhlc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ab>", "<null>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abc>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abhlca>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ab>", "<sample:4>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:00>", "<sample:2>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-54", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:/>", "<sample:3>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:aahlc>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:  l>", "<sample:1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "4"}, {"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ahlc>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abhc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "51", "<sample:2>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:t>", "<sample:1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abh>", "<empty>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:b>", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aa:b>", "2", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:`bhc>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
