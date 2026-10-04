package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "0", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483594"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000036", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"27"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-4022"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFF04A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-4054"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFF02A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-3926"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFF0AA", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-3942"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFF09A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-3966"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFF082", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147352575"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFDFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "2147483647", "<empty>"}, false, 12, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "0", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#32;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:!>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#33;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C0000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1077936128"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BFC00000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "-1", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"71"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:.>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:bb>", "0", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:bbn>", "0", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:0>"}}), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abcc>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:KK>", "-2147483648", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"268435198"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFEFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"134217599"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFF7F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abcc>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abcc>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aibcc>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abcc>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#105;&#98;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abcc>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#32;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:F >"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab;cc>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#70;&#32;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab;cc>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:`>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#96;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:r`>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#114;&#96;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "-2147483648", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s::>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s::abc>", "1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s::>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:ab;cc>", "-2147483648", "<sample:1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:ab;cc>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "-1", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:/>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abcc>", "2147483583", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "2147483647", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:<>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#60;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:B>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>c>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#66;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:B>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:4>c>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "2147483647", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0042", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a+bcc>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:4>c>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "2147483647", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061\\u002B\\u0062\\u0063\\u0063", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abcc>", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "0", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "46", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "46", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061\\u0062", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:e>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abcc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abbcc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#98;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abCbcc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#67;&#98;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aECtEc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#69;&#67;&#116;&#69;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:: >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#58;&#32;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s::\t!>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#58;&#9;&#33;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:B:\t!>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#66;&#58;&#9;&#33;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:C:\t!>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#67;&#58;&#9;&#33;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-2147483648", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab=cc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:b>", "2147483647", "<empty>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-1", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "1", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\n>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "10", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#10;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\n>>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "10", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#10;&#62;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:00>", "0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:aX>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abccm>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:ab;cc>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:B#bccm>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abc>", "<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ab;cc>", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:F0>", "2147483647", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ab;dc>", "<sample:1>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:ab;cc>", "0", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:ab;cc>", "-1", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abcc>", "-2147483648", "<sample:3>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence", "0"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "1"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0073\\u0061\\u006D\\u0070\\u006C\\u0065", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:ab>", "1", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483632"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483632"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFF0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483587"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFC3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1073741793"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFE1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1074003937"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4003FFE1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1074003937"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BFFC001F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:b>", "<empty>"}, false, 12, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:H>", "1", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:H>", "2", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abcc>", "1", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:1>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "0", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:D>", "-1073741824", "<sample:2>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:2>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "-1", "<sample:1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abcb>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abcc>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "10", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "1", "<sample:3>"}}, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "0"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:ab,>", "0", "<sample:0>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: E>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-2147483648", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:+HaTa>", "0", "<empty>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:`>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "2147483647", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "-2147483648", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "0"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abcc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0073\\u0061\\u006D\\u0070\\u006C\\u0065", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:3>"}}, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "3"}, {"translate", "java.lang.CharSequence,java.io.Writer", "4"}, {"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:v0>", "0", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab;c>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
