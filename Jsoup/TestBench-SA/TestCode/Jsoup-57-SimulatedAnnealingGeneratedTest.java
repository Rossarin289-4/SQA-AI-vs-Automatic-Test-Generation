package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "T_/a/b", "false"}, {"org.jsoup.nodes.Attributes", "asList", ""}}, 3), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}, {"keySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " data-=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", " "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}}), new String[][]{{"put", "java.lang.String,java.lang.String", "2"}, {"clear", "", "7"}, {"remove", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020,01-.01"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:oe>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}}, 2), new String[][]{{"removeIgnoreCase", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "2020-01-\n1"}}, 3), new String[][]{{"put", "java.lang.String,boolean", "6"}, {"hasKeyIgnoreCase", "java.lang.String", "3"}, {"asList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:Fbd]>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "0x1234789", "1.15d"}}, 1), new String[][]{{"removeIgnoreCase", "java.lang.String", "3"}, {"hasKeyIgnoreCase", "java.lang.String", "6"}, {"asList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"a\", 0x1234789=\"1.15d\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0x1234789=\"1.15d\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:4>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.Hd"}}, 1), new String[][]{{"dataset", "", "3"}, {"putAll", "java.util.Map", "2"}, {"replace", "java.lang.Object,java.lang.Object", "3"}, {"putAll", "java.util.Map", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "aaaaaaabaaaaaaaaabaaaaaaaaaaaa"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<b:false>"}}, 2), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "6"}, {"getIgnoreCase", "java.lang.String", "6"}, {"dataset", "", "3"}, {"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "\n"}}, 2), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "2010,01-.01", " "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1015507292", String.valueOf(actual));
  assertEquals("receiver state after the call", " 2010,01-.01=\" \" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "PT1H", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", " PT1H=\"2020-02-30T25:61:61\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"clear", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<null>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.1234567", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.1234567 {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.1234567 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.1234567", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" 1.1234567 {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.1234567 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H.5", "1.25"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H.5=\"1.25\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT0H.5", "1.25"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT0H.5=\"1.25\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H.5", "1.24"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H.5=\"1.24\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H.5", "1.241.5e300"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H.5=\"1.241.5e300\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"dsue?Hemmmlo, "}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" .5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " .5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}, 3), new String[][]{{"entrySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" .5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "{\"a\":1}"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-268435456>"}, false, 9, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.12345678901234567", "-0.0"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.12345678901234567=\"-0.0\" comment=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.12345678901234567", "-0.0"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.12345678901234567=\"-0.0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61I62"}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "T_/a/b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "\n"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "//b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "/a/b"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "5."}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H=\"/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H1.5", "/a/b"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "5."}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H1.5=\"/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H1.5", "/`/bb"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "5."}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H1.5=\"/`/bb\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H15", "/`/bb"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "6."}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "Title"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H15=\"/`/bb\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P6T1H15", "i`/bb"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "6."}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "Title"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " P6T1H15=\"i`/bb\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "/a/b0"}}, 3), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"/.,1-1"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5C"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"nn"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"nn"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"=aT=bP<"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"containsValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"values", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "i"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0x123456789A"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "i"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0x123456789A"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "BdsueHfllo, World"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "BdsueHfllo, World"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"P1", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " P1 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "null"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{";T1I", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "null"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " ;T1I {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"[1,2]", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "null"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " [1,2] {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e9", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "null"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " \u00e9 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e9", "false"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "null"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "0x123456789", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0x123456789=\"1.1234567\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0x123456789=\"1.1234567\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H=\"1.25\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H.5", "1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H.5=\"1.25\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H.5", "1.241.5e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " PT1H.5=\"1.241.5e300\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1.241.5e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x123456789=\"1.241.5e300\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1/241.5e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x123456789=\"1/241.5e300\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 15, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "T_/a/b"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"5."}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "-0.0"}, {"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"BdsueHfllo, World"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " data-=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" data-=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}, {"keySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " data-=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}, {"keySet", "", "5"}, {"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" data-=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" .5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " .5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " .5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " text=\"a\" .5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "data-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5d", "T_/a/b"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.5d=\"T_/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.12345678901234567", "-0.0"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.12345678901234567=\"-0.0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"BdsueHfllo, World"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,2]", "false"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,2]", "false"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,1]", "false"}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,1]", "false"}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "2020-02-30T25:61:61", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 2020-02-30T25:61:61 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "2020-02-30T25:61:61", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 2020-02-30T25:61:61 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{".-1"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "-1.5"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"h/a/b"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "BdsueHfllo, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\n\t"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "0x1F", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0x1F=\"-1.5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:3>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "-1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"/L"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}, 3), new String[][]{{"remove", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-5", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1E-5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567890123456", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.1234567890123456 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1W34567890123456", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.1W34567890123456 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1W34567890123456", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1W345678901230456", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.1W345678901230456 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"TT>ITLE"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "a b", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " a b=\"010\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e-0.0", "/\n"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " sample=\"\" e-0.0=\"/\n\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"f-0.0", "/\n"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " sample=\"\" f-0.0=\"/\n\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"f-0.0", "/\n"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " f-0.0=\"/\n\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"f-0.0null", "\n"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " f-0.0null=\"\n\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"f-0.0null", "1E-5"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " f-0.0null=\"1E-5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"BdsueHfllo, World"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"BdsueHfllo, World"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "123456789012345678901234567890", "PT1H"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 123456789012345678901234567890=\"PT1H\" comment=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "BdsueHfllo, World"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " http://example.com/a?b=c=\"1.12345678901234567\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "\t"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:9>"}, {"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " http://example.com/a?b=c=\"\t\" comment=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" text=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,2]", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" [1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", " [1,2] {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "[1,2]", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\" [1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" [1,2] {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5d", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.5d=\"a,b,c\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5d", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.5d=\"a,b,c\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5d", "a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.5d=\"a,b,c\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5e300"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[text=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "i"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "i"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a b"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "i"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "a b", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a b=\"-1.5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " a b=\"-1.5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "a b", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\" a b=\"-1.5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" a b=\"-1.5\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "a b", "-1-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\" a b=\"-1-5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" a b=\"-1-5\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "a b", "-1-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a b=\"-1-5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " a b=\"-1-5\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:a>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:a>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:aa>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:aa>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:aa>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:aa>"}, {"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "T_/a/b"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "T_/a/b"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x11345789", "HEd;lp, Word"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<null>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x11345789=\"HEd;lp, Word\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.25", "-1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.25=\"-1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "r"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.25", "-1"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.25=\"-1\" {getKey=1.25, getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.25=\"-1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "r"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.25", "-1"}}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.25", "-1"}}, 1), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" text=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" text=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " http://example.com/a?b=c=\"1.12345678901234567\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 9, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1.1234567890123456data-"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1.1234567890123456data-"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1.123456789012356data-"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1.123456789012356data-"}, {"org.jsoup.nodes.Attributes", "asList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1.123456789012356data-"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.123456780123\t3567"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:bX>"}, false, 14, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 2020-02-30T25:61:61=\"1.5d\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5f", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.5f {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5f", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.5f {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5f", "true"}}, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.5f {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5fPT1H", "true"}}, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.5fPT1H {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "0x123456789"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "nuI2"}}, 3), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:0>"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "-,./I"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.1234,678"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:key>"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "\u00e9", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " \u00e9 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "\u00e9", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " text=\"a\" \u00e9 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "\u00e9", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" \u00e9 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x123456789", "false"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x023456789", "true"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x023456789 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x023457789", "true"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x023457789 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x023457789/a/b", "true"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x023457789/a/b {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x023457789/a/b", "true"}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" 0x023457789/a/b {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaabaaaaaaaaaaaaaaaa"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673654", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1367757049", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458080437", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2958", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5d", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48153208", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.5d {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5d", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48153208", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.5d {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<null>"}}), new String[][]{{"get", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLE", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " TITLE {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLE", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLF", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " TITLF {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"UITLF", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " UITLF {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x123456789", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " 0x123456789 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", ".5"}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "010", "null"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", ".5"}}, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 010=\"null\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "010", "null"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", ".5"}}, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 010=\"null\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "010", "null"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", ".5"}}, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " 010=\"null\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{".a/b"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.1234567890123456", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.1234567890123456=\"1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.1234567890123456", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.1234567890123456=\"1e10\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.=\"1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" 1.=\"1e10\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "BdsueHfllo, World", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", ""}}, 1), new String[][]{{"put", "java.lang.String,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " comment=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
