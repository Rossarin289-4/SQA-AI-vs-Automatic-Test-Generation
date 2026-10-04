package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s: >"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}, {"translate", "java.lang.CharSequence,java.io.Writer", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T >"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1T >"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1T ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "65535", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<null>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:+>", "10", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65534"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"32767"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "65535", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "65535", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:  >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "65535", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:H  >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "65535", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:H! >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "65522", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H! ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence,java.io.Writer", "4"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "4"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741853"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4000001D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741799"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFE7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483598"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFCE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483598"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFCE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "0", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:W  >", "0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<null>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bbc>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bbc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ibc>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ibc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ic>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ic", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:d>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "0", "<empty>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<null>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "5"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "0", "<empty>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:6>", "<null>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "5"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "0", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:mbc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "0", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mbc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:mbd>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "0", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mbd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:3>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "65536", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "0", "<empty>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:b>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s: >"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:^9>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:ac>", "2147483647", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:8>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "65536", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"47"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-32815"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF7FD1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-32855"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF7FA9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\nb3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\nb3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\nbb3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\nbb3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2621377"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFD8003F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-5242242"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFB0027E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-5242240"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFB00280", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"5242240"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4FFD80", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"5242293"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4FFDB5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"6290869"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5FFDB5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-6290869"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFA0024B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aP>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aP", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence", "1"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"translate", "java.lang.CharSequence", "1"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}, {"translate", "java.lang.CharSequence", "2"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C0000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147481600"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000800", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "1", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<empty>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "1", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:1>", "<sample:1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-65534"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF0002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-21"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFEB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:.m+cEI>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:. 0>", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:gI>", "0", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:`>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}, {"translate", "java.lang.CharSequence", "1"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "3"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "6"}, {"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "1", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "0", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
}
