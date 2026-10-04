package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "10", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "2147483647", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:abc>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "-2147483648", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<null>", "<sample:4>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s: >", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483646", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:b>", "1073741803", "<sample:2>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFE", String.valueOf(actual));
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073774591"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40007FFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073774591"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40007FFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073774641"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40008031", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073774640"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40008030", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-16384"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFC000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:c>", "-2147483648", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "1", "<null>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:Db>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:`>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<null>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0t>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:T>", "0", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<sample:3>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.text.translate.AggregateTranslator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 14, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 14, new String[][]{}), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"translate", "java.lang.CharSequence", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:abc>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "-1", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:T>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:T>", "1073741803", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "0", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:b>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "0", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "2147483647", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-2147483648", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:d>", "-125", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "-1", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<null>", "1", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483603"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8000002D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483542"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8000006A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483542"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFF96", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1073741771"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3FFFFFCB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:>", "1", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:7>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:8>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:p>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:pp>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:2\\\t4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:W>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:\u00e9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:W>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:\u00e9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-43"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFD5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"20"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"40"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ma>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:maa>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:mab>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:nab>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:bdo>", "536870932", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483646", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483647", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ac>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:A>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:ac>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:@>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("@", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:a>", "1", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "10", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:;l>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "-2147483648", "<sample:2>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFF6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:b>", "1073741803", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:b,>", "2147483606", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaa1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ap1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:,>", "2147483606", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaapa1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:`42D>", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "1", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:cc>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:V>", "-1", "<empty>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:o0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:a>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:a>", "1073741803", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:a>", "<sample:3>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "java.io.Writer"}, new String[]{"<s:0>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-24"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFE8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-23"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFE9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-46"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFD2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "hex", new String[]{"int"}, new String[]{"2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7FFFFFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:{>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:b>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0=_>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:S>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483646", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0__>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:S>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483646", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample__", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:S>", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:0>", "2147483646", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ttX>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:T>", "<sample:2>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:abc>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ttX", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<null>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<null>", "-1", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:0>", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "76", "<sample:0>"}}), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "4"}, {"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "7"}, {"translate", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence"}, new String[]{"<s:h/ME>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "-2147483648", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:ab]c>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:b7>", "0", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aha/aMaE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence", "<s:a>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:b>", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:T>", "<sample:2>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:1>"}}), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:0>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:3>"}, false, 11, new String[][]{}, 2), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}, 1), new String[][]{{"with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "1"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#97;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s:>", "<sample:0>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s: >", "-2147483648", "<null>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:>", "0", "<empty>"}}, 2), new String[][]{{"translate", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:2>"}, false, 14, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "3"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<empty>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:b>", "-2147483648", "<null>"}}, 3), new String[][]{{"translate", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#115;&#97;&#109;&#112;&#108;&#101;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 3), new String[][]{{"translate", "java.lang.CharSequence,java.io.Writer", "4"}, {"translate", "java.lang.CharSequence,int,java.io.Writer", "6"}, {"translate", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "with", new String[]{"org.apache.commons.lang3.text.translate.CharSequenceTranslator[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,int,java.io.Writer", "<s:abc>", "2147483647", "<sample:3>"}, {"org.apache.commons.lang3.text.translate.LookupTranslator", "with", "org.apache.commons.lang3.text.translate.CharSequenceTranslator[]", "<sample:2>"}}, 1), new String[][]{{"translate", "java.lang.CharSequence,int,java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:0i>", "0", "<sample:3>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.text.translate.LookupTranslator", "org.apache.commons.lang3.text.translate.LookupTranslator", "translate", new String[]{"java.lang.CharSequence", "int", "java.io.Writer"}, new String[]{"<s:abc>", "0", "<empty>"}, false, 14, new String[][]{{"org.apache.commons.lang3.text.translate.LookupTranslator", "translate", "java.lang.CharSequence,java.io.Writer", "<s: >", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
