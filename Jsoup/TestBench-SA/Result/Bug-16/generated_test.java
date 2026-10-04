package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}, {"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}}, 3), new String[][]{{"after", "org.jsoup.nodes.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicid=\"0\" systemid=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"0\" publicid=\"sample\" systemid=\"\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"sample\" publicid=\"\" systemid=\"a\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"a\", publicid=\"0\", systemid=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"0\", publicid=\"sample\", systemid=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"sample\", publicid=\"\", systemid=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"asList", "", "4"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 1), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 1), new String[][]{{"parent", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"v0 1.12345678901234567"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "27"}, {"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.5d"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"publicId"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "010"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"name"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "2147483647"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "\u00e9<!DOCTYPE "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"dataset", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"sample\" public\u0131d=\"\" system\u0131d=\"a\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "\013", "#doctype"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#,dobtypse1.12345678901234567", "5"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "10"}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}}, 2), new String[][]{{"nodeName", "", "3"}, {"attr", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "-0.0"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "-0.0"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "-0.0"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aalc", "01/"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "systemId"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:3>"}}, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aalc", "01"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "systemId"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:3>"}}, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}, {"siblingNodes", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{" \""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "abc"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "abc"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "abcPT1H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "0", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "0", "<sample:6>"}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}, {"org.jsoup.nodes.DocumentType", "parent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "1.5d", "123456789012345678901234567890"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}}, 2), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1710662449", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1448232596", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("567982857", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<empty>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"after", "org.jsoup.nodes.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicid=\"0\" systemid=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"a\", publicid=\"0\", systemid=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"0\", publicid=\"sample\", systemid=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[name=\"sample\", publicid=\"\", systemid=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}), new String[][]{{"parent", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "abc"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?a=c", "abc"}, false), new String[][]{{"absUrl", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?a=c", "affbc"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}}), new String[][]{{"absUrl", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}}), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", " \""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"u00"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "-1"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "1", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"1.1234568890123"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "1", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2i020,0230T25{:61:61"}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "10", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"publicId"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.DocumentType", "attributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "#doctype"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "#doctype"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"0\" publicid=\"sample\" systemid=\"\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"sample\" publicid=\"\" systemid=\"a\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"dataset", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"name"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:7>"}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:}a>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "1", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"-1073741876"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-."}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "I"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "2020-02-30T25:61:61"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-1073741867", "<sample:1>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:2>", "<sample:1>"}}), new String[][]{{"before", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "256", "<sample:4>"}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483648", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"systemId"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"systemHd"}, false), new String[][]{{"after", "org.jsoup.nodes.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"...e6"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"D-0.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>\n <#root></#root><!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.DocumentType", "parent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2\t12:30:>51.5e300"}, false), new String[][]{{"nodeName", "", "3"}, {"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"name"}, false), new String[][]{{"nodeName", "", "3"}, {"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE  PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"#doctype"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1D.5"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1E.5"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}), new String[][]{{"parent", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "1073741823", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "#dd ctype", "publhcId"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:eL>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "a"}}, 3), new String[][]{{"wrap", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "aaaaaaaaaaaaaaaaaaaEaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "aaaaaaaYaaaaaaaaaaaEaaaaaaaaaa1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "aaaaaaaYaaaaaaaaaaaEaaaaaaaaaa1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>", "-2147483648", "<sample:0>"}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}, {"org.jsoup.nodes.DocumentType", "parent", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"absUrl", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"get", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"get", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"get", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-2147483648"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "publicId"}, false), new String[][]{{"hasAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "abc"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:8>", "-1073741824", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "-10"}, {"org.jsoup.nodes.DocumentType", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15162124", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("247267729", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1355806333", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-922945510", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->\n <!--0-->\n <!--a-->", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", " "}}, 3), new String[][]{{"hasAttr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", " "}}, 3), new String[][]{{"hasAttr", "java.lang.String", "5"}, {"hasAttr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<empty>"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{" PUBLIC \""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "0", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-620", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-620", "<sample:1>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1706836241", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "10", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "1.123"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.1234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.1234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"p["}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "-1"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"34"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-2"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-2"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
}
