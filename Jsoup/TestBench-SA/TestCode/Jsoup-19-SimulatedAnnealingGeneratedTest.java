package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "0xFFFFFFFF", "2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"5.", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"u"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true), new String[][]{{"preserveRelativeLinks", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"-1.5", "i", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"b"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "TITLE", "2020-/2-30T25:61:61--1", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "strike", "<sample:5>", "<sample:1>"}}), new String[][]{{"dataset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1.5", "1.5", "<null>"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "TITLE", "2020-/2-30T25:61:61--1", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "strike", "<sample:5>", "<sample:1>"}}), new String[][]{{"put", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"o-0.012324567890134456789012"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "-strong", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"dt", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"q:", "<null>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "q"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"t", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "el"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "2147483648", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "el"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "2147483648", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true), new String[][]{{"addTags", "java.lang.String[]", "1"}, {"addTags", "java.lang.String[]", "0"}, {"addAttributes", "java.lang.String,java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "Hello, World", ".-1", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "strong", "<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "PT1H", "010", "a b"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"dd", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.5d", "1.12245678", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "blockquote", "<sample:1>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "\u00e9"}}, 3), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.5d", "1.5", "<sample:0>"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "blockquote", "<sample:1>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "\u00e9\u00e9"}}, 3), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "12:30:45"}}), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addAttributes", "java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"-1.5", "1.5f", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"Titll_", "1.5g2020-02m21T25:661:61", "<empty>"}, false, 3, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "\n", "<sample:1>"}}, 1), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1"}, {"addTags", "java.lang.String[]", "4"}, {"preserveRelativeLinks", "boolean", "3"}, {"preserveRelativeLinks", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"g5.,."}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"get", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"g5.,."}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "2020.02-30T25:61:61"}}), new String[][]{{"get", "java.lang.String", "5"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"g53.,A.TThte"}, false, 0, null, 2), new String[][]{{"get", "java.lang.String", "5"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{".50"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1L", "u", "<sample:1>"}}, 2), new String[][]{{"put", "org.jsoup.nodes.Attribute", "5"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{".50"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1L", "u", "<sample:1>"}}), new String[][]{{"put", "org.jsoup.nodes.Attribute", "5"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}, {"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "1.5d", "<sample:1>"}}, 3), new String[][]{{"preserveRelativeLinks", "boolean", "7"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "2020-02-30T25:61:61", "[1,2]"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-02-30T25:61:61", "1E-5", "small"}, {"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "1L", "0x1F", "cite"}}), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<a?b</a>", "020-0", "122456789012345678901234567890"}, false, 14, new String[][]{}, 2), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\t\tbrrTITLE1e10", "TISLE", "om"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}}, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"\u00e9\u00e9", "0x123456789", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "12:30:45", "a bli", "12:20:45"}}, 2), new String[][]{{"preserveRelativeLinks", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"\u00e9^\u00e9", "1.25", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-01-01", "0y123456789", "1"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{".4"}, false, 0, null, 3), new String[][]{{"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"ol"}, false, 10, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "b", "qi", "{\"a\":1}"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "strong"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"\u00e9\u00e9", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "citf", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"TITLE", "Titleabc", "null"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "-1.5"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "-0.0"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}}, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "2"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}}, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "[1,2]", "<sample:4>", "<sample:7>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "-2"}}), new String[][]{{"hasKey", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"true", "<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"true", "<sample:5>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"Icite"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"ol", "<null>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"\t", "<sample:7>", "<sample:0>"}, false, 16, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-02-30T25:61:61", "\n", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addProtocols", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"bq-1.5", "a b", "<sample:2>"}, false, 5, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", ".5", "-0.0", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"2020-0_2-30T25:61:61", "<empty>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "PT1H", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"ff-1", "h1.25", "1.5f"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<empty>"}}, 3), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"Title", "<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "-.0", "1e10", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "dt", "Hellp, World", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"010", "<sample:3>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"00012", "<sample:3>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "{\"a\":1}", "0", "2020-01-01"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "{\"a\":1}", "0", "2020-01-01"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:1>"}}, 2), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"li", "Title", "23456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}, {"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "strong"}, {"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-02-30T25:61:61", "+1", "010"}}, 1), new String[][]{{"addTags", "java.lang.String[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addEnforcedAttribute", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\n", "br", "1.1234567890123456dl"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "q"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "PT1H", "1", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", ""}}, 3), new String[][]{{"addTags", "java.lang.String[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{",1", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "1.12345678901234567", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"ol", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "I", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 12, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-01-01", "pre", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"2020-2-30T25:62:61b"}, false, 5, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "-11.5d"}, {"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "2020-01-01", "pre", "I"}}, 3), new String[][]{{"put", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"code", "<empty>"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "preserveRelativeLinks", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:2>"}}, 2), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"pittea,b-c"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "1.12345678", "<null>"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "T", "PT1H", "<sample:0>"}}, 1), new String[][]{{"dataset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addTags", "java.lang.String[]", "0"}, {"addAttributes", "java.lang.String,java.lang.String[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addTags", "java.lang.String[]", "0"}, {"addAttributes", "java.lang.String,java.lang.String[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addTags", "java.lang.String[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"blockquote", "<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"--2"}, false, 2, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "0x1F", "br", "1.12345678"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "strike", "<sample:0>", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "/W/b"}}, 2), new String[][]{{"dataset", "", "1"}, {"putAll", "java.util.Map", "7"}, {"containsValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"--2"}, false, 2, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "0x1F", "br", "1.12345678"}, {"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "strike", "<sample:0>", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "/W/b"}}, 2), new String[][]{{"dataset", "", "1"}, {"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"3-I\u00e90pxFFFFFFF"}, false, 2, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "a b", "<sample:0>", "<sample:5>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "blockquote"}}, 2), new String[][]{{"dataset", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"3-I\u00e90pxFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "a b", "<sample:0>", "<sample:5>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "blockquote"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "Hello, Would"}}, 2), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"3-I\u00e90pxFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "a b", "<sample:0>", "<sample:5>"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "blockquote"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "Hello, Would"}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"bode", "<sample:11>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"Tbictbe.He[lo, WDorle"}, false, 12, new String[][]{}, 3), new String[][]{{"get", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"aa-,b,nc1"}, false, 12, new String[][]{}, 3), new String[][]{{"get", "java.lang.String", "7"}, {"put", "org.jsoup.nodes.Attribute", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "5"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "5"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "5"}, {"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"put", "java.lang.String,java.lang.String", "7"}, {"iterator", "", "0"}, {"hasNext", "", "4"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addTags", "java.lang.String[]", "1"}, {"addTags", "java.lang.String[]", "0"}, {"addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"2020-02-30S24A;61:T1"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<null>"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1-5f", "12:30:45", "<sample:0>"}}, 3), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"a"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "\u00e9\u00e9", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "p", "12:30:45", "<sample:0>"}}, 3), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"a"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "\u00e9\u00e9", "<sample:4>"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" rel=\"nofollow\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"1474836481E-5"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1E-5", "1.12345678", "<empty>"}, {"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "small", "<sample:0>"}, {"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "li", "1E-5", "<null>"}}, 3), new String[][]{{"size", "", "3"}, {"hasKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"preserveRelativeLinks", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"preserveRelativeLinks", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"113930:"}, false, 0, null, 1), new String[][]{{"asList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basicWithImages", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "\u00e9", "<sample:6>", "<sample:3>"}}, 1), new String[][]{{"put", "org.jsoup.nodes.Attribute", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"\r"}, false, 10, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "PT1H", "http://example.com/a?b=c", "<null>"}}, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 10, new String[][]{{"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}, {"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "TITLE"}}, 1), new String[][]{{"iterator", "", "4"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "relaxed", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addTags", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "cite", "<sample:2>", "<sample:7>"}}, 3), new String[][]{{"preserveRelativeLinks", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "simpleText", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"aaaaaaaaaaaaaaaaahaaaaaaaaTaaaaa", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "--"}}, 1), new String[][]{{"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "6"}, {"addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"1.26", "<sample:1>", "<null>"}, false, 10, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "--", "<sample:2>", "<sample:7>"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "none", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"addAttributes", "java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"_.123T\"6789012.24456ol"}, false, 13, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "1.5e300", "<null>"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}}, 1), new String[][]{{"iterator", "", "0"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "getEnforcedAttributes", new String[]{"java.lang.String"}, new String[]{"blockquote"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "a,b,c", "code", "blockquote"}}, 1), new String[][]{{"put", "java.lang.String,java.lang.String", "5"}, {"get", "java.lang.String", "2"}, {"put", "org.jsoup.nodes.Attribute", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" a=\"0\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"q"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "addProtocols", "java.lang.String,java.lang.String,java.lang.String[]", "small", "", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.safety.Whitelist", "addEnforcedAttribute", "java.lang.String,java.lang.String,java.lang.String", "--", "{\"a\":1}", "br"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "basic", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"addAttributes", "java.lang.String,java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"br"}, false, 14, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "false"}, {"org.jsoup.safety.Whitelist", "preserveRelativeLinks", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeAttribute", "java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute", "--1", "<sample:5>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.jsoup.safety.Whitelist", "getEnforcedAttributes", "java.lang.String", "aabaaaaaaaaaaaaaa6aaaaaaaamaaaaa"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"p"}, false, 4, new String[][]{{"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeTag", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "addAttributes", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"cite", "<sample:0>"}, false, 10, new String[][]{{"org.jsoup.safety.Whitelist", "isSafeTag", "java.lang.String", "uI"}, {"org.jsoup.safety.Whitelist", "addTags", "java.lang.String[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.safety.Whitelist", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Whitelist", "org.jsoup.safety.Whitelist", "isSafeAttribute", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "org.jsoup.nodes.Attribute"}, new String[]{"[1,2]", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{{"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "[1,2]", "<sample:4>"}, {"org.jsoup.safety.Whitelist", "addAttributes", "java.lang.String,java.lang.String[]", "{\"a!:1}", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
