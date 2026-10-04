package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"4<"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("4&lt; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4&lt; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:0>"}}), new String[][]{{"createElement", "java.lang.String", "7"}, {"previousElementSibling", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "1.1334c67"}, {"org.jsoup.nodes.Document", "title", ""}}, 3), new String[][]{{"normalise", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n 1.1334c67\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a\n<html>\n<head>\n</head>\n<body>\n 1.1334c67\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1.5d\n02/-01-01TITLE"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "\"roota b"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Document", "toString", ""}}), new String[][]{{"normalise", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body> 1.5d 02/-01-01TITLE\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body> 1.5d 02/-01-01TITLE\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{">.5", "TTLE"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "className", ""}, {"org.jsoup.nodes.Document", "val", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "0h\t020-01-01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "http://example.com/a?b=c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "http://example.com/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "http://example.cpm/a?b=c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "http://example.cpm/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "http://example.cpm/a?b=c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Document", "equals", "java.lang.Object", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2147483648", "PT1H"}, {"org.jsoup.nodes.Document", "previousSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "+1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "+1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("4 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"4<"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("4&lt; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4&lt; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"4I"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("4I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<0xffffffff>\n</0xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0xffffffff>\n</0xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"00xFFFFFFFF"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<00xffffffff>\n</00xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<00xffffffff>\n</00xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"0_0xFFFFFFFF"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<0_0xffffffff>\n</0_0xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0_0xffffffff>\n</0_0xffffffff> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"head"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<head>\n</head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<head>\n</head> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"heada b"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<heada b>\n</heada b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<heada b>\n</heada b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"head b"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<head b>\n</head b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<head b>\n</head b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 1), new String[][]{{"nextSibling", "", "3"}, {"select", "java.lang.String", "7"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.12345678>\n</1.12345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.02345678"}, false, 0, null, 1), new String[][]{{"nextSibling", "", "3"}, {"select", "java.lang.String", "7"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.02345678>\n</1.02345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\r", "a`aaaaaaaaaaaaaxaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}, 3), new String[][]{{"hasClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\r", "a`aaaaaaaaaaaaaxaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}, 3), new String[][]{{"hasClass", "java.lang.String", "2"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "a`aaaaaaaaaaaaaxaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "-1073741825"}, {"org.jsoup.nodes.Document", "childNodes", ""}, {"org.jsoup.nodes.Document", "text", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "2020-02-30T25L:61:61"}}, 3), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25L:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-536870884"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "202"}, {"org.jsoup.nodes.Document", "text", "java.lang.String", "--1--1"}, {"org.jsoup.nodes.Document", "title", ""}}, 2), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "202 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "202true"}, {"org.jsoup.nodes.Document", "text", "java.lang.String", "--1"}, {"org.jsoup.nodes.Document", "nodeName", ""}}, 2), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "202true {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}, {"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "nodeName", ""}}, 1), new String[][]{{"clear", "", "1"}, {"append", "java.lang.String", "2"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("753707963", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"m1d.25"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "123456789012345678901234567890"}, {"org.jsoup.nodes.Document", "previousElementSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"=,b,cTitle"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}, 3), new String[][]{{"append", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"canContainBlock", "", "7"}, {"canContainBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"\tbody"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"1e11"}, false, 6, new String[][]{}, 1), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"-40"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-F"}, {"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-F {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", ".F"}, {"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".F {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "."}, {"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ". {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "/"}, {"org.jsoup.nodes.Document", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"1"}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2147483648", "Hello, Wo\rld"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,,8"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<ff,,8 class=\" sample\">\n</ff,,8> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,,7\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<ff,,7 class=\" sample\">\n</ff,,7> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,7\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<ff,7 class=\" sample\">\n</ff,7> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,7\t\u00e9"}, false, 0, null, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<ff,7\t\u00e9 class=\" sample\">\n</ff,7\t\u00e9> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,7\tr\u00e9"}, false, 0, null, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<ff,7\tr\u00e9 class=\" sample\">\n</ff,7\tr\u00e9> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Ff,7\tr\u00e9"}, false, 0, null, 2), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}, 3), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head>\n </head>\n <body>\n </body>\n</html><1e-5>\n</1e-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}}, 3), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><1e-5>\n</1e-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}}, 3), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1e-5>\n</1e-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1F-6"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}}, 3), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1f-6>\n</1f-6> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1G-6"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}}, 3), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1g-6>\n</1g-6> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1?5", "-0.5"}, false, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}, {"org.jsoup.nodes.Document", "siblingElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}, {"org.jsoup.nodes.Document", "siblingElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-1.5>\n</-1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-1.5>\n</-1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "title", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "\t", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5d {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5d {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<sample:1>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "TITLE"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"2147483548"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "body", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "#document"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Document", "body", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "#document"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "+.25"}, {"org.jsoup.nodes.Document", "body", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "prepend", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Document", "title", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "http://example.com/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2"}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}), new String[][]{{"first", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}), new String[][]{{"first", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}), new String[][]{{"first", "", "0"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "/a/b", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2147483648", "PT1H"}, {"org.jsoup.nodes.Document", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"html", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"4I"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("4I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"I"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "Title"}, {"org.jsoup.nodes.Document", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.12345678>\n</1.12345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.12345678>\n</1.12345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.12345678>\n</1.12345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2.123456781.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2.123456781.5d>\n</2.123456781.5d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2.123456781.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<2.123456781.5d>\n</2.123456781.5d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2.123456781.5d>\n</2.123456781.5d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2.123456781.5d{"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<2.123456781.5d{>\n</2.123456781.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2.123456781.5d{>\n</2.123456781.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2.12345678.5d{"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<2.12345678.5d{>\n</2.12345678.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2.12345678.5d{>\n</2.12345678.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678.5d{"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.12345678.5d{>\n</1.12345678.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.12345678.5d{>\n</1.12345678.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678.5d{"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.12345678.5d{>\n</1.12345678.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.12345678.5d{>\n</1.12345678.5d{>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345679.5d{"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.12345679.5d{>\n</1.12345679.5d{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.12345679.5d{>\n</1.12345679.5d{>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345679.5c{"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.12345679.5c{>\n</1.12345679.5c{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.12345679.5c{>\n</1.12345679.5c{>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345679.5c{"}, false, 5, new String[][]{}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.12345679.5c{>\n</1.12345679.5c{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.1n2345669.5c{"}, false), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.1n2345669.5c{>\n</1.1n2345669.5c{> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false), new String[][]{{"getElementById", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "a`aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\r", "a`aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}), new String[][]{{"hasClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "data", ""}}), new String[][]{{"preserveWhitespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "data", ""}}), new String[][]{{"preserveWhitespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "text", ""}, {"org.jsoup.nodes.Document", "id", ""}}), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}}), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}}), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}}), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "null", ""}}), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "null", ""}}), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}, {"org.jsoup.nodes.Document", "text", "java.lang.String", "TITLE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{":", "020-02-30T25:61:61"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"listIterator", "", "3"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"5"}, false), new String[][]{{"clear", "", "6"}, {"outerHtml", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "<a>b</a>"}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>b</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "2020-02-30T25L:61:61"}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25L:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "202"}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"select", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "202 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483621"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "202"}, {"org.jsoup.nodes.Document", "title", ""}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}, {"attr", "java.lang.String,java.lang.String", "1"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "202 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "1.5", " "}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"69"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "---1"}, {"org.jsoup.nodes.Document", "preserveWhitespace", ""}, {"org.jsoup.nodes.Document", "baseUri", ""}}), new String[][]{{"clear", "", "1"}, {"outerHtml", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n ---1\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}, {"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"clear", "", "1"}, {"append", "java.lang.String", "2"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "true"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "tuue"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "tvue"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "0"}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Document", "classNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("753707963", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("753707963", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"hrh6dE"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "2147483648"}, {"org.jsoup.nodes.Document", "className", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n<head>\n <title>hrh6dE</title>\n</head>\n<body>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Document", "head", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "val", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1L0"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1L0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1L0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"11L"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1e910"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("11L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "11L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1e910"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.1234567 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.1234567 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "body"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<body>\n</body> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.25>\n</1.25> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.25>\n</1.25> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.2.5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.2.5>\n</1.2.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.2.5>\n</1.2.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.2.5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "previousElementSibling", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.2.5>\n</1.2.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1/2.5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1/2.5>\n</1/2.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1/2-5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1/2-5>\n</1/2-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"7/2-5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<7/2-5>\n</7/2-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"7.2-6"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<7.2-6>\n</7.2-6> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeDepth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.W2355648901234577a"}, false), new String[][]{{"eq", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"-11.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"Ehtotp:/exahmple.col/a?b=c"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:0>"}, {"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}}), new String[][]{{"createElement", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n</sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}, {"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "#document"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}, {"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "#document"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}, {"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "#document"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root>\n</#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<sample:5>"}, {"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<sample:3>"}, {"org.jsoup.nodes.Document", "append", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body> 1.25\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "1.x5"}, {"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.x5", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body> 1.x5\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "className", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "a"}, {"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "true"}, {"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2147483648", "Hello, World"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "a b", "1.5"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2147483648", "Hello, World"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "a b", "1.5"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2147483648", "Hello, World"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "a b", "1"}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<[1,2]>\n</[1,2]> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"[1,P]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<[1,p]>\n</[1,p]> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"[1,P]"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<[1,p] class=\" sample\">\n</[1,p]> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"[1P]"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<[1p] class=\" sample\">\n</[1p]> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2020-02-30t25:61:61 class=\" sample\">\n</2020-02-30t25:61:61> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"202E-02-30T25:61:61"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<202e-02-30t25:61:61 class=\" sample\">\n</202e-02-30t25:61:61> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"---1"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<---1 class=\" sample\">\n</---1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"---0"}, false), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<---0 class=\" sample\">\n</---0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}), new String[][]{{"select", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "-0.5"}, false), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}, {"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String", "c5,1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1.5dhtml"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5dhtml {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5dhtml {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "0"}, {"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "+.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "-262144"}, {"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "+.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "TITLE"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "html"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "TITLE"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "html"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "TITLE"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "html"}}, 3), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "TITLE"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "html"}}), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "TITLE"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "html"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "\u00e9"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "htl"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "\u00e9"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "htl"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "2147483648", "\u00e9"}, {"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "htl"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a-->\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a-->\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "J"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "\037"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "siblingElements", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>, \n<head>\n</head>, \n<body>\n</body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"put", "org.jsoup.nodes.Attribute", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {\"a\":1}=\" x \t y \" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}}, 2), new String[][]{{"put", "org.jsoup.nodes.Attribute", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {\"a\":1}=\" x \t y \" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "val", "java.lang.String", "TITLE"}}, 2), new String[][]{{"put", "org.jsoup.nodes.Attribute", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" value=\"TITLE\" {\"a\":1}=\" x \t y \" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "val", "java.lang.String", "TITLE"}}, 2), new String[][]{{"put", "org.jsoup.nodes.Attribute", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "5."}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "i"}, {"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", "i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", "a,b,c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder", "<empty>"}, {"org.jsoup.nodes.Document", "nextElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ".5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "children", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "children", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "children", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<sample:6>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}, {"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "0xFFFFFFFF"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n <head>\n </head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n </head>\n <body>\n </body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "10"}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n </head>\n <body>\n </body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n </head>\n <body>\n </body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}, {"removeAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>, \n<head>\n</head>, \n<body>\n</body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"removeClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"removeClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}, {"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\013\""}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}, {"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "&quot; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\013#"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}, {"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "# {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\013$"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}, {"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"$0p123456789"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}, {"org.jsoup.nodes.Document", "addChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("$0p123456789 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0p123456789 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.123\n4567"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasAttr", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasAttr", new String[]{"java.lang.String"}, new String[]{"titld"}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "0x123456789"}, {"org.jsoup.nodes.Document", "head", ""}}, 3), new String[][]{{"is", "java.lang.String", "1"}, {"wrap", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "data", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "data", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n<head>\n</head>\n<body>\n</body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
