package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\tbb>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:`>", "2147483647", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tbb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:`>", "65535", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:e\tbbW>", "2147483647", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:4\tb-b>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:  >", "65535", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:\tbcb>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:t>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:`>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: >", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "-2147483648", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:`:o>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:   >", "0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`:o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-57"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFC7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abcb>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 3), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:t\tbb>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t\tbb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:7a5>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abLc>", "65534", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7a5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "53", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:6>"}}), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "1"}, {"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a0bc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:\tbb>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:[?a>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: >", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0\u00e9>", "65535", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aac>", "-45", "<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65536"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:Ia>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:bc>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:tB>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFE6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65534"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:f >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ar>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-42", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ar", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65535"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2162686"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20FFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:`>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65535"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: ;\n>", "0", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:,>", "0", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:p`>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:\tub>"}}), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"32"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "4"}, {"translate", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:\tb>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:D;>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C0000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:[ >"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "1073741823", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "-2147483648", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:!>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: \">", "65598", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:i1>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "0"}, {"translate", "java.lang.CharSequence,java.io.Writer", "2"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65536"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:3`>", "<sample:2>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\u00e90r>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e90r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\tcb>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tcb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:;>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:`t>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:=a>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:!>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0 >"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:abc>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:!>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "0", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:F>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65535"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65536"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:\tbbb>", "2147483647", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:4 ,>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 ,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:TWc>", "-2147483648", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"67108854"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-2147418112"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80010000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"67108864"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"65531"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "65567", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:bc>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "hex", new String[]{"int"}, new String[]{"-22"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFEA", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:\na\u00e9>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:4>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:d abc>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-1073741824", "<sample:3>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:_>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: \"\">", "0", "<sample:1>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence", "<s:-bb>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:Pbc>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:1>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a,\u00e9>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abbb>", "2147483647", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:aac>", "20", "<sample:6>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:\t>", "<sample:3>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-2147483648", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "org.apache.commons.lang3.text.translate.NumericEntityUnescaper", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
}
