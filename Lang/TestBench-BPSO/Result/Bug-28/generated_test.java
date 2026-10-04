package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:]>", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65517"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFED", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-1073741849"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BFFFFFE7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:b>", "65534", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:bc>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc2>", "2147483647", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a\"c>", "20", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-131070"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFE0002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:3>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:  >", "<sample:3>"}}), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:]>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:p>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:I0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:^>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:\037l>", "0", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:0]>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s::>", "<empty>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "3"}, {"translate", "java.lang.CharSequence,java.io.Writer", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65536"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:aai>", "1073741823", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "7"}, {"translate", "java.lang.CharSequence", "7"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:f>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:->"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65536"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:} >", "2147483647", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:^>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:00>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: >", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:a:bc>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: [;>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" [;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037\037>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:X]8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X]8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\"a>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"32767"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2162688"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("210000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\ra>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ra", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"66046"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("101FE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:I>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:A>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:`>", "<empty>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-30"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFE2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0o>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "10", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-12"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:i0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bb[c>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:\r0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bb[c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:\\>", "0", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:!>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0D>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:au>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("au", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:x>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-2147483648", "<sample:2>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-4202496"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFBFE000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"131070"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1FFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"32792"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8018", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: \r>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ab>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abI>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:]>", "<empty>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "5"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<null>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:a>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:;a>", "<null>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:cc>", "0", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 4, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "32767", "<sample:0>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:f>"}}, 3), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "5"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
}
