package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "2147483647", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: 0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#32;&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "2147483647", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-2147483648", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "2147483647", "<null>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"67108854"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-104"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFF98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-58"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFC6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:aab>", "-2147483591", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:!>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:5>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:1>", "71", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "10", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "-2147483648", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"17"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"49"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"98"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"152"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"177"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"88"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("58", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"124"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"62"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "-2147483648", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#98;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:acc>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#99;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ac>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#99;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "-2147483648", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:ab7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1065353147"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C0800045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1610612736"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A0000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-1612709877"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9FE0000B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1612709877"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("601FFFF5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1612709939"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("60200033", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 3), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "1"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aa>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:la>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#108;&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#49;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0031", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:[>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:C>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483637"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8000000B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483637"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFF5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"1073741818"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFA", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0020", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:m>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:mm>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:m6m>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m6m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "5"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "0"}, {"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "5"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "0"}, {"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:\036>", "<null>"}, false, 8, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:am,>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("am,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:.am,>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".am,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:x>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:.>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#120;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:=>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:dCCX>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#100;&#67;&#67;&#88;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:/CCX>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:a>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#47;&#67;&#67;&#88;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "10", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:\r>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"-2147483641"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "hex", new String[]{"int"}, new String[]{"2147483641"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFF9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "5"}, {"translate", "java.lang.CharSequence,java.io.Writer", "5"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "-1073741824", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:0[>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "-1073741824", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:0[>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "10", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s: >"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:0>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 13, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:{>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#123;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:{>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u007B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:m>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u006D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:F>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:`r>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "0", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "2147483647", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:\">", "<sample:4>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abc>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:0>"}}, 3), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-2147483648", "<sample:4>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<empty>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:0>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0073\\u0061\\u006D\\u0070\\u006C\\u0065", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:->", "-1", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:2>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:1>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:aa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:00>", "1", "<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "-2139095040", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence", "4"}, {"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:1\">", "1", "<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:[1>", "<sample:0>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s: >", "0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-1", "<null>"}}, 3), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "3"}, {"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#48;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.CharSequenceTranslator", "org.apache.commons.lang3.text.translate.AggregateTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:\\8>>", "<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483647", "<empty>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.CharSequenceTranslator", "translate", "java.lang.CharSequence", "<s:cbh>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
}
