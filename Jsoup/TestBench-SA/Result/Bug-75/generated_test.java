package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "true", "true"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "2020-01-01", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true, 2020-01-01=\"Hello, World\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " true 2020-01-01=\"Hello, World\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0=\"sample\" data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "0", "2"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "7"}, {"putAll", "java.util.Map", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" data-key0=\"0\" data-key1=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"getIgnoreCase", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 16, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "3020-0"}}, 3), new String[][]{{"clone", "", "0"}, {"hasKeyIgnoreCase", "java.lang.String", "2"}, {"asList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1+234567890123456", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2"}}, 3), new String[][]{{"removeIgnoreCase", "java.lang.String", "7"}, {"normalize", "", "0"}, {"put", "java.lang.String,java.lang.String", "4"}, {"hasKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.1+234567890123456 =\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.1234567890123456", "a,b,c"}}), new String[][]{{"hasKey", "java.lang.String", "2"}, {"get", "java.lang.String", "4"}, {"removeIgnoreCase", "java.lang.String", "2"}, {"put", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.1234567890123456=\"a,b,c\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.1234567890123456=\"a,b,c\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:3>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:12>"}, false, 14, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "2"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"put", "java.lang.String,boolean", "2"}, {"addAll", "org.jsoup.nodes.Attributes", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0 #cdata=\"a\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0 #cdata=\"a\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "I", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" i {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " i {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1134567", "134568899012345678902224567890"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:7>"}}, 1), new String[][]{{"dataset", "", "1"}, {"putAll", "java.util.Map", "6"}, {"keySet", "", "3"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1.1134567=\"134568899012345678902224567890\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Hello, Wo?ld+"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"Hello, Wo?ld+\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1), new String[][]{{"removeIgnoreCase", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" a=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "{\"a\":1}", "1.5f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {\"a\":1}=\"1.5f\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<>bc\"ba>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "a,bc4"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"{I"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Attributes", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"6{I\u00e8\u00e9"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "{\"a\":"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.5f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"tsu"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "<a>b</a>2020-01-01"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.Y;f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"http://"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "<a>b</a>2020-01-01"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.12345678901234567", "i"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.Y;f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 1.12345678901234567=\"i\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"  b", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("   b {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "   b {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"  b", "false"}, false, 1, new String[][]{}, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"  b1.25", "true"}, false, 1, new String[][]{}, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("   b1.25 {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "   b1.25 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e300", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2147473648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147473648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1d:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1d:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1d:30:45123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1d:30:45123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "<a>b</ae>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"<a>b</ae>\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "<a>b;/ae>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"<a>b;/ae>\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nulm", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" nulm", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" nulm {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nulm", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" nulm", String.valueOf(actual));
  assertEquals("receiver state after the call", " nulm {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" nul", String.valueOf(actual));
  assertEquals("receiver state after the call", " nul {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "true"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "\n", "null"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" nul \n=\"null\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " nul \n=\"null\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "true"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "\n", "null"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" nul \n=\"null\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" nul \n=\"null\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" nul", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" nul {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "false"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nul", "false"}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:4>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.Attributes", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\t-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1E-5", "--1"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1E-5=\"--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.1234567890123456", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.1234567890123456=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", ""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "ull"}}, 1), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "0"}, {"html", "", "6"}, {"get", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " 010=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "Title"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "tll0xFFFFFFFF"}}, 2), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "0"}, {"html", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 010=\"Title\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " 010=\"Title\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1e0", "iule"}}, 3), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}, {"put", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1e0=\"iule\"  {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1e0=\"iule\"  {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, null, 3), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("  {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"data-", "true"}, false, 0, null, 3), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" data- {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data- {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"data-http://example.com/a?b=c1L", "true"}, false, 0, null, 3), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" data-http://example.com/a?b=c1L {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-http://example.com/a?b=c1L {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"data-http://example.com/a?b=c1L", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5e300", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.5e300=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" data-http://example.com/a?b=c1L {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.5e300=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" data-http://example.com/a?b=c1L {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}, 2), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 1), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 1), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"hasNext", "", "6"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.123D567c890123456true"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.123D567c890123456true"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "Tithe"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "Tithe"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "true", "false"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "2020-01-01", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2020-01-01=\"Hello, World\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 2020-01-01=\"Hello, World\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "true", "true"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "2020-01-01", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\", true, 2020-01-01=\"Hello, World\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" true 2020-01-01=\"Hello, World\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "1.1234567890123456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " 123456789012345678901234567890=\"1.1234567890123456\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "+1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " \u00e9=\"+1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4", "+1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 4=\"+1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5", "+1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 5=\"+1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "+1"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"+1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1F", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0x1F {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0x1F {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:2>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"[1,2]", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"j:PT", "<a>b</a>"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.5f", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" j:PT=\"<a>b</a>\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1.12345677890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345677890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 22, new String[][]{}), new String[][]{{"putAll", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 23, new String[][]{}), new String[][]{{"putAll", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "<null>", "010"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "5"}}), new String[][]{{"get", "java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "<null>", "010"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "TITLE", "true"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" TITLE {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "<null>", "0010"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "TITLE", "true"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " TITLE {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "<null>", "0010"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "TITLE", "true"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "5"}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " TITLE {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "{\"a\":1}", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {\"a\":1}=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "{\"a\":1}", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {\"a\":1}=\"1.5f\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<>bc\"ba>"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "a,bc4<a>b</a>"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "get", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0x1F", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0x1F", "false"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" a=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0x1F", "false"}}), new String[][]{{"removeIgnoreCase", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0x1F", "false"}}), new String[][]{{"removeIgnoreCase", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "data-"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b</a>=\"data-\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b</a>=\"data-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "eata-"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b</a>=\"eata-\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b</a>=\"eata-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.a>", "ea>ta-"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b<.a>=\"ea>ta-\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.a>=\"ea>ta-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.a>", "ea>tb-1e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b<.a>=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.a>=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.`>", "ea>tb-1e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b<.`>=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.`>=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.`>", "ea>tb-1e10"}, false), new String[][]{{"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.`>=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.`>2020-01-01", "ea>tb-1e10"}, false), new String[][]{{"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.`>2020-01-01=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<.`>2020A01-01", "ea>tb-1e10"}, false), new String[][]{{"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b<.`>2020A01-01=\"ea>tb-1e10\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"[1,"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "{a\":"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "<a>b</a>2020-01-01"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.Yf"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{",f10"}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"  b", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("   b {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "   b {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e300", "true"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1.5e300 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e300", "false"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"4`1b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "  {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "data-", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " data-=\"true\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "data-", "trWe"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " data-=\"trWe\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "data-1E-5", "trWe"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " data-1E-5=\"trWe\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "data-1E-5", "tfWe"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " data-1E-5=\"tfWe\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "0", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"2\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "0", "<a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"<a>b</a>\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "<a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"<a>b</a>\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "", "<a>b</ae>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " =\"<a>b</ae>\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:2>"}, false), new String[][]{{"dataset", "", "5"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "null", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" null", String.valueOf(actual));
  assertEquals("receiver state after the call", " null {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "null", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" null", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" null {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "nulm", "true"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" nulm", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" nulm {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:4>"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.Attributes", "size", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:8>"}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "=\""}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=\"=&quot;\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=\"=&quot;\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "\u00e9", "true"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:8>"}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" \u00e9 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "\u00e9", "true"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:8>"}, {"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("\u00e9 {getKey=\u00e9, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " \u00e9 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0", "true"}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0\u00e9", "true"}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0\u00e9 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "0\u00e9\u00e9", "true"}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0\u00e9\u00e9 {getKey=0\u00e9\u00e9, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0\u00e9\u00e9 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "1.1234567890123456"}, false), new String[][]{{"size", "", "0"}, {"normalize", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" http://example.com/a?b=c=\"1.1234567890123456\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " http://example.com/a?b=c=\"1.1234567890123456\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http9//example.com/a?b=c", "1.1234567890123456"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " http9//example.com/a?b=c=\"1.1234567890123456\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http9//example.com/a?b=c", "1.1234567890123446"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " http9//example.com/a?b=c=\"1.1234567890123446\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"3"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1E-5", "--1"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "a"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1E-5=\"--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1E-4", "--1"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "a"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1E-4=\"--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1E-4", "-i1"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 1E-4=\"-i1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:1>"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a>b</a> {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a>b</a> {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLE", "true"}, false), new String[][]{{"getIgnoreCase", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " TITLE {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TIT", "true"}, false), new String[][]{{"getIgnoreCase", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " TIT {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TT", "true"}, false), new String[][]{{"getIgnoreCase", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " TT {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"TT", "true"}, false), new String[][]{{"put", "java.lang.String,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" TT  {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " TT  {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"XT", "true"}, false), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" XT {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " XT {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false), new String[][]{{"hasKey", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals("  {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}}), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "7"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"=\""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" 20x1F", "datb-"}, false, 15, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}}, 3), new String[][]{{"asList", "", "4"}, {"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=\"", "datb-"}, false, 15, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}}, 3), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[=\"=\"datb-\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " =\"=\"datb-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=\"", "datb-Hello, World"}, false, 15, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-1>"}, {"org.jsoup.nodes.Attributes", "dataset", ""}}, 3), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[=\"=\"datb-Hello, World\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " =\"=\"datb-Hello, World\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"==W2020-01-01", "db[tb-"}, false, 14, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" ==W2020-01-01=\"db[tb-\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " ==W2020-01-01=\"db[tb-\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "--1", "true"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2017852090", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" --1 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "--1", "true"}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1648889358", String.valueOf(actual));
  assertEquals("receiver state after the call", " --1 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", ""}}), new String[][]{{"next", "", "1"}, {"setKey", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "5"}}), new String[][]{{"next", "", "1"}, {"setValue", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "5"}}), new String[][]{{"next", "", "1"}, {"setValue", "java.lang.String", "3"}, {"setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".22", "--1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " .22=\"--1\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".22", "--1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1e10", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1e10=\"-1\" .22=\"--1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".22", "=\""}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1e10", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1e10=\"-1\" .22=\"=&quot;\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".22", "0\"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1e10", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1e10=\"-1\" .22=\"0&quot;-1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "putIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".32", "0\"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "1e10", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " 1e10=\"-1\" .32=\"0&quot;-1\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}}, 2), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "data-"}}), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1-5f"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:4>"}, {"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a b"}}), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "a b"}}), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:al>"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1/25"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:al>"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1/25"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:al>"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1/25"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#cdata=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:all>"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}}, 1), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "false"}}, 2), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "false"}}, 2), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}, 2), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" -1.5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}, 2), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.BooleanAttribute", actual.getClass().getName());
  assertEquals("-1.5 {getKey=-1.5, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " -1.5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" -1.5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}, 1), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("#cdata=\"a\" {getKey=#cdata, getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" -1.5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}, 1), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.BooleanAttribute", actual.getClass().getName());
  assertEquals("-1.5 {getKey=-1.5, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " -1.5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.BooleanAttribute", actual.getClass().getName());
  assertEquals("-1.5 {getKey=-1.5, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " -1.5 {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "-1.5", "true"}}), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" -1.5 {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"Hello,!World"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " i=\"/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "5", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 5=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" i=\"/a/b\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "5", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 5=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" i=\"/a/b\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "5", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" 5=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" i=\"/a/b\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "5", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " 5=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" i=\"/a/b\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "i", "/a/b"}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "21474833648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " i=\"/a/b\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "21474833648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "21474833648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "<null>"}, {"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "Xw1F"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "1.1234567890123456", "false"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" data-key0=\"0\" data-key1=\"sample\" data-key2=\"\" {size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" 0=\"sample\" data-key0=\"sample\" data-key1=\"\" {size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"sample\" data-key1=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" data-key0=\"sample\" data-key1=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "0", "2"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:5>"}}, 3), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" data-key0=\"sample\" data-key1=\"\" {size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"u/>25Title"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "\u00e9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "1..25"}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "3"}, {"keySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "!"}, {"org.jsoup.nodes.Attributes", "html", ""}}, 3), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "normalize", ""}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "1.5e300", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.5e300=\"0x1F\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.5e300=\"0x1F\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "false"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}, 2), new String[][]{{"put", "java.lang.String,java.lang.String", "7"}, {"normalize", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " sample=\"\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "-1", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " -1=\"123456789012345678901234567890\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("686521130", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"5a bTITLE"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "data-", "true"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " data- {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"5c "}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "dbta-", "true"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "0xFFFFFFFF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " dbta- {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2/20-02-30T25:61:61Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/20-02-30T25:61:61Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"1M"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1M", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2M"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2M", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"2N"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2N", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"-N"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-N", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "checkNotNull", new String[]{"java.lang.String"}, new String[]{"-N1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-N1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a=\"0\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "TITLE"}, {"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.25=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.25=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.15", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 1.15=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.15=\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\" {size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
