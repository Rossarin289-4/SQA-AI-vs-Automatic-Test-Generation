package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World10", ";010"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "10", "<\""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 10=\"<&quot;\" Hello, World10=\";010\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 10=\"<&quot;\" Hello, World10=\";010\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1\"-"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"put", "java.lang.String,java.lang.String", "3"}, {"getIgnoreCase", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"putAll", "java.util.Map", "2"}, {"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}}), new String[][]{{"putAll", "java.util.Map", "2"}, {"put", "java.lang.String,java.lang.String", "2"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{0=sample, key1=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" data-key1=\"sample\" data-0=\"sample\" {size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"put", "org.jsoup.nodes.Attribute", "1"}, {"put", "java.lang.String,java.lang.String", "1"}, {"put", "java.lang.String,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 0 a=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0 a=\"0\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"6.", "false"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "i41", "false"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:8>"}}, 3), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "3"}, {"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "{\"a\":1}"}, false, 5, new String[][]{}, 2), new String[][]{{"get", "java.lang.String", "6"}, {"normalize", "", "2"}, {"html", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" =\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " =\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{":dt-[1,2]", "0x123456789"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "4", "1e5d"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "5. ", "true"}}, 1), new String[][]{{"asList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[4=\"1e5d\", 5., :dt-[1,2]=\"0x123456789\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 4=\"1e5d\" 5.  :dt-[1,2]=\"0x123456789\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:9>"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "2L"}}, 2), new String[][]{{"hasKey", "java.lang.String", "7"}, {"removeIgnoreCase", "java.lang.String", "6"}, {"removeIgnoreCase", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"entrySet", "", "7"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"1.12:34567890123456"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-1>"}, {"org.jsoup.nodes.Attributes", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"dta-"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "TIITLE", "true"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "3data--1", "1.6d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " TIITLE 3data--1=\"1.6d\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"Title12:30:45"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "", "TIISLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" =\"TIISLE\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"set", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e400", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.5e400 {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.5e400 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"01\"0-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01\"0-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "dta-"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "4", "6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 4=\"6\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"<\""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "TITLH", "true"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5e3/0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " TITLH {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:2>"}}, 3), new String[][]{{"clear", "", "1"}, {"containsKey", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"[1,2^"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".]", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " .] {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "="}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"2true"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.5f1234567890123456789012345678901L"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"TIITLE112:30:45"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"TIITLF;010"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.02345667", "Title1.12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.02345667=\"Title1.12345678\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"4Title"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:12>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "h0x123456789", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"/b/b"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "aacc", "123456789012345678901234567890"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" aacc=\"123456789012345678901234567890\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"--11.12345678901234561.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--11.12345678901234561.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"4\n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:2>"}}, 3), new String[][]{{"put", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1.25true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:6>"}}, 2), new String[][]{{"hasKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"get", "java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"http://example.com/a?b=c", "false"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:3>"}}, 3), new String[][]{{"removeIgnoreCase", "java.lang.String", "1"}, {"normalize", "", "0"}, {"put", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.5", "-0.1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "2147483648", "1e000"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 2147483648=\"1e000\" -0.5=\"-0.1\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 2147483648=\"1e000\" -0.5=\"-0.1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1\n.12\t34567"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 3), new String[][]{{"put", "org.jsoup.nodes.Attribute", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "11"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" i=\"11\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" i=\"11\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "010"}}, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-367465224", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.1234567890123457"}}, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "5", "true0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 5=\"true0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "/a/bF"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "abc"}}, 2), new String[][]{{"containsValue", "java.lang.Object", "3"}, {"put", "java.lang.String,java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " data-0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"Sitle"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.1234567890123456", "true"}}, 3), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "1"}, {"getIgnoreCase", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1.1234567890123456 <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"\t-.0"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1.\u00e9e300", "a"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.\u00e9e300=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1), new String[][]{{"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"dta-"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"4Title"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:1>"}}), new String[][]{{"asList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kkey>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e400", "false"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1", "data-"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 1=\"data-\" a=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1=\"data-\" a=\"0\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"+1http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"keySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{":dta-[1,2]"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}d-1.5"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false), new String[][]{{"entrySet", "", "6"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"=\"a,b,c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"removeAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1\n.12\t34567"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"entrySet", "", "4"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "5"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "-.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" 0=\"sample\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("686521130", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "123456789012345678901234567890"}}), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{":dta-[1,2]i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":dta-[1,2]i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "2147483648\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"null\u00e9"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<null>"}}), new String[][]{{"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"+1{\"a\":1}", "false"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1\n.12\t34567"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1.1n34567", "010aaaaaaaaaaaaaaaaaaaaaaaaa aaaaa"}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.1n34567=\"010aaaaaaaaaaaaaaaaaaaaaaaaa aaaaa\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaabaaaaaaaaaaaaaaaaa2020-01-01"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b[c-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b[c-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b1.5", "10Ti2tle"}, false, 6, new String[][]{}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a b1.5=\"10Ti2tle\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:6"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, Worldabc", "3cata--1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" Hello, Worldabc=\"3cata--1\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " Hello, Worldabc=\"3cata--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"20}0-01-01", "I"}, false), new String[][]{{"dataset", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 20}0-01-01=\"I\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"/a/Hb"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"Hello, World10"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"10+12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10+12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xEFFFFFFF"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Ep", "dBta-"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " Ep=\"dBta-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "toString", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false), new String[][]{{"hasKey", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"a,a,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,a,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "0d1F"}, false, 4, new String[][]{}), new String[][]{{"hasKey", "java.lang.String", "6"}, {"asList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\", 1e10=\"0d1F\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1e10=\"0d1F\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"TWitle4Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TWitle4Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10http://example.com/a?b=c", "0xFFFFFFFF"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 1e10http://example.com/a?b=c=\"0xFFFFFFFF\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1e10http://example.com/a?b=c=\"0xFFFFFFFF\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "TTLE"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 2020-02-30T25:61:61=\"TTLE\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 2020-02-30T25:61:61=\"TTLE\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1e10\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "2020-0"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.5e300=\"2020-0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"-.0{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.0{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4", "5."}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "PT1HHello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 4=\"5.\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"+A1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "B", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " B=\"1.1234567\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"aHello, World10"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "Hello, World1.5e400"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678901234567890", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 123456789012345678901234567890 {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 123456789012345678901234567890 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\u00e9H"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", " b", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "  b {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"1e10,"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" =\" \" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", ";020"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "---1", "-1.51.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " ---1=\"-1.51.1234567\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "r"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" =\"r\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "p\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" =\"p\n\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"?", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "<aa>b</a>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "214748364abc", "1.223"}}), new String[][]{{"removeIgnoreCase", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 214748364abc=\"1.223\" ? {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 214748364abc=\"1.223\" ? {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".0.5", "true"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1-", "1.12345A67"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" .0.5 1-=\"1.12345A67\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " .0.5 1-=\"1.12345A67\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>Wb</a>", "18"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " <a>Wb</a>=\"18\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "0102020-02-40T25:61:61"}}), new String[][]{{"get", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"Uitle"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0xFFFFFFFFhttp://example.com/a?b=c", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 0xFFFFFFFFhttp://example.com/a?b=c {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "12345678902345678901234557890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "2020-02-30T25:61", "0x1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 2020-02-30T25:61=\"0x1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "a,c,c"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" \t=\"a,c,c\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " \t=\"a,c,c\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "3"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-051", "dta-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 2020-01-051=\"dta-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 2020-01-051=\"dta-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "."}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"H", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1\n.112\n34567", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1\n.112\n34567=\"2\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1\n.112\n34567=\"2\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "/"}, false), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" true=\"/\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " true=\"/\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"put", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4", "1u5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "", "false"}}), new String[][]{{"get", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 4=\"1u5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{\"a\":1}\n", "true"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{\"a\":1}\n {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World10", "dta"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "\"+110"}, {"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " Hello, World10=\"dta\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6\u00e9d", "5."}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 1.6\u00e9d=\"5.\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1.6\u00e9d=\"5.\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "", "1.5e3T0"}, {"org.jsoup.nodes.Attributes", "dataset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"P", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1."}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" P {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " P {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "\u00e9a\037b", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" \u00e9a\037b=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " \u00e9a\037b=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:2>"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "2144483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "6.", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 6. {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0m10"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "1"}, {"remove", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.123567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"10a b"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "010i", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 010i {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.51.12345678", "true"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "4[1,2]", "0"}}), new String[][]{{"normalize", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 4[1,2]=\"0\" 1.51.12345678 {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 4[1,2]=\"0\" 1.51.12345678 {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:1>"}}), new String[][]{{"put", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" 0=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" 0=\"sample\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", " b", "1.<a>b</a>"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("  b=\"1.<a>b</a>\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  b=\"1.<a>b</a>\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"TIIT LE"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678901234567890Hello, World10", "false"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "{#a\":1}", "/a/ba"}}), new String[][]{{"put", "org.jsoup.nodes.Attribute", "6"}, {"put", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" {#a\":1}=\"/a/ba\" a=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {#a\":1}=\"/a/ba\" a=\"0\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5d", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" .5d", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" .5d {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"+1http://example.com/a?b=c", "true"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "-1.5"}, {"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" +1http://example.com/a?b=c {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " +1http://example.com/a?b=c {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "11", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 11 {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 11 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:0>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "daa,", "/a/b"}}), new String[][]{{"normalize", "", "3"}, {"put", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" daa,=\"/a/b\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " daa,=\"/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", ""}}), new String[][]{{"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "010", ":dta-[1,20"}, {"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 010=\":dta-[1,20\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}}), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "true1.5e400", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" true1.5e400=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:19>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "null<a>b</a>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " null<a>b</a>=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false), new String[][]{{"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "12:30:45", "H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 12:30:45=\"H\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"12345678:012345678901234567890"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "<#", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " <# {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "1ee10"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "nuk", "K"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " nuk=\"K\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", ".5e300", "PS1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " .5e300=\"PS1H\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"true", "false"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "/a/b", "12:30:44"}, {"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " /a/b=\"12:30:44\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "b", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " b=\"\n\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:9>"}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "1."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"na"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"2147483648-0.0", "true"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "aaaaaa`"}}), new String[][]{{"getIgnoreCase", "java.lang.String", "3"}, {"dataset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 2147483648-0.0 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"true", "true"}, false, 2, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " true {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{" \r", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"getIgnoreCase", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "  \r {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "//ab"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "2020-01-01", "/a/a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 2020-01-01=\"/a/a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", ".5r", ":1D5d"}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" .5r=\":1D5d\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:7>"}}, 2), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "0"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1.", "110"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "\u00e9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 1.=\"110\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1E-5", "1.5e300"}}), new String[][]{{"put", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" 1E-5=\"1.5e300\" 0=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1E-5=\"1.5e300\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "/a/b[", "true"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "TITLD", "2020-02-30T25:61:61true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " /a/b[ TITLD=\"2020-02-30T25:61:61true\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:6>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", ""}}, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"41.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("41.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"sample\" data-key1=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "ab"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "nullla b", "0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " nullla b=\"0x123456789\" [1,2]=\"ab\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2020-01-01http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1189237012", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" aaaaaaaaaaaaaaaaaaaaaaaaaaaaa=\"2020-01-01http://example.com/a?b=c\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "1.123356781.5e300"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"values", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "-1.51.1234567890123456"}}, 3), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "3"}, {"put", "java.lang.String,java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " data-sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1234567890123456789012345678890", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 1234567890123456789012345678890 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "5.", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<a>b</a>2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 3), new String[][]{{"put", "java.lang.String,boolean", "2"}, {"put", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" a=\"0\" 0 {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" a=\"0\" 0 {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "112445678"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1.5e301"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e301", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"data-4Title", "false"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}}, 2), new String[][]{{"put", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"1.5e40/"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{":dta-\\1,2C"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":dta-\\1,2C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "a,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-82", "true"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0xFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " -82 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "<a>b</a>", "-1.5i123456789012345678901234567890"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " <a>b</a>=\"-1.5i123456789012345678901234567890\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "", "true"}, {"org.jsoup.nodes.Attributes", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "  {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"a\037b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1.123456789t12345671.5", "3d?ata--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.123456789t12345671.5=\"3d?ata--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"<"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", ".5d", ".5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " .5d=\".5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.6e400", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"hasKey", "java.lang.String", "2"}, {"hasKey", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", ",0."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "7"}, {"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:9>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2147483647>"}}, 3), new String[][]{{"hasNext", "", "0"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "+10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"TIIT E"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIIT E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", ".55", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " .55=\"2147483648\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.123456784"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "Title", "0xFFFFFFFF"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", ":dta-[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " Title=\"0xFFFFFFFF\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.1234}5678"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"1.1234}5678\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
