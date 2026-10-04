package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:10>"}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "\t\t]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "<a>b;/a>0x1F"}, {"org.jsoup.nodes.Node", "nodeName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false), new String[][]{{"siblingNodes", "", "1"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", ""}, {"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "abs:2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 2), new String[][]{{"absUrl", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a>a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}, {"nodeName", "", "0"}, {"absUrl", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "268451840"}}), new String[][]{{"previousSibling", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:11>"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "71", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "32768", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:3>"}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-32768", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"32768"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "16384", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "32769"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"+1Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}, {"org.jsoup.nodes.Node", "outerHtml", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->\n <!--a--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"8192", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "1", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "http://example.com/a??b=c"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1), new String[][]{{"ownerDocument", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"\u00e9ulr"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1234567890123a5678901234567890"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 1), new String[][]{{"childNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "32768", "<sample:5>"}, {"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "Hello, World"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "32769", "<sample:6>"}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "0x1\r"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "1L"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"28"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"cT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "1", "<sample:4>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "32767", "<sample:9>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 3), new String[][]{{"remove", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "32767", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "32767", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "childNode", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-16384"}, {"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "--1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083362", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "14385", "<sample:2>"}, {"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "1.1234567890123E567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}, {"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "-32768", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<sample:5>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--><!a> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1/"}, {"org.jsoup.nodes.Node", "childNode", "int", "-32768"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}, {"org.jsoup.nodes.Node", "attr", "java.lang.String", "1..12345678901234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:11>"}, {"org.jsoup.nodes.Node", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}, {"org.jsoup.nodes.Node", "childNode", "int", "15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "32767"}, {"org.jsoup.nodes.Node", "baseUri", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"46"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "1073741823", "<sample:2>"}, {"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"aaaaaa;aaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "Title\n"}, {"org.jsoup.nodes.Node", "baseUri", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ".a/b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/Dd", "{\"a\"91}"}, false, 0, null, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "a sb"}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Node", "nextSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1015808", "<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "[0,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "32804", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1x"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "00.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"?1.4d"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-32752"}, {"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "  "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "8421377", "<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "2", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("193240891", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "32639"}, {"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-32818", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "#t"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "."}, {"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "32778"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>", "32768", "<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}, {"org.jsoup.nodes.Node", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-2.12>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}, {"org.jsoup.nodes.Node", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"16384", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"I\u00e9"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-21"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-32739"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "\t\t\t"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "32767"}, {"org.jsoup.nodes.Node", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "-4227043", "<sample:5>"}, {"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-40914", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:11>"}}), new String[][]{{"setBaseUri", "java.lang.String", "3"}, {"absUrl", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "#text-1"}}), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:6>"}, {"org.jsoup.nodes.Node", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b\u00e9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "1.1234567", "t"}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "-16369"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "10", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"childNode", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "\"--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483647", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147479552"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}, {"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "0+123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}, {"org.jsoup.nodes.Node", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1a5", "1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-134184960", "<sample:0>"}, {"org.jsoup.nodes.Node", "ownerDocument", ""}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:\"ey>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "32769", "<sample:1>"}}), new String[][]{{"attr", "java.lang.String", "5"}, {"siblingNodes", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "16385", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"000", "xFFFFFEFF"}, false), new String[][]{{"previousSibling", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"0x123556789"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}, {"org.jsoup.nodes.Node", "ownerDocument", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-32785", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--><!a> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}), new String[][]{{"parent", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"294942"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"40"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"fx1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}), new String[][]{{"nodeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "-1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"attributes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" i=\"-1.5\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}), new String[][]{{"asList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "0", "<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"numl"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "0", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083362", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "-1"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false), new String[][]{{"getData", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-11"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "-32793", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"/a{"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"nextSibling", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "1", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-32768", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083346", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"baseUri", "", "3"}, {"absUrl", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:52>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"/0/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "--1", "+1"}}), new String[][]{{"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"214483648"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"attributes", "", "3"}, {"hasKey", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}, {"org.jsoup.nodes.Node", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900492", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-[1-01", "-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}), new String[][]{{"absUrl", "java.lang.String", "2"}, {"outerHtml", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}, {"org.jsoup.nodes.Node", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "aa"}}), new String[][]{{"siblingIndex", "", "7"}, {"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a1.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:5>"}, {"org.jsoup.nodes.Node", "ownerDocument", ""}}), new String[][]{{"ownerDocument", "", "3"}, {"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"P\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"2020-02-30S25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}, {"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "\t\t\t]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}, {"org.jsoup.nodes.Node", "setSiblingIndex", "int", "1073741827"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "1.1", "1."}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-32739", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "2020-/2-30T25:6s1:61"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "2.5"}}), new String[][]{{"hasAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-32768"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "#texu"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<d:-2.12>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "536870912"}, {"org.jsoup.nodes.Node", "attr", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "I1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!---->\n <!--a--> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "-2147483648", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "ab,c", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "131072", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "-1"}, {"org.jsoup.nodes.Node", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"-"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}, {"org.jsoup.nodes.Node", "toString", ""}}), new String[][]{{"outerHtml", "", "7"}, {"parent", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"uu"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:14>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false), new String[][]{{"attr", "java.lang.String,java.lang.String", "3"}, {"siblingNodes", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa`a"}}), new String[][]{{"get", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "2147483647", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:11>", "<sample:11>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a-->0 {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "16423"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 1), new String[][]{{"size", "", "4"}, {"remove", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample-->\n <!--a--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"hasAttr", "java.lang.String", "2"}, {"siblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "T-itle123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "0", "<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"ownerDocument", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"/a/b8"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-0H2-30T25:61961"}, false, 0, null, 1), new String[][]{{"nextSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"16384", "<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "--,"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 1), new String[][]{{"nodeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"previousSibling", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->a\n <!--a--><!a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"-11.1234567"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "7"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "16324", "<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1E-5{\"a\":1}"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample-->a\n <!--a--><!a> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nvll", "#"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1), new String[][]{{"ownerDocument", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "19", "<sample:6>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "#text"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,a,c5.", "d-0.0"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}}, 3), new String[][]{{"nodeName", "", "3"}, {"siblingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----><!a>\n <!--a--> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "1", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 2), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}, {"childNode", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<sample:3>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:a>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a--><!a>\n <!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<d:-2.12>"}, {"org.jsoup.nodes.Node", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"Tit2e"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "-.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "null"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "1e102020-02-30T25:61:61", "{\"a\":1}"}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "35", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "32760", "<null>"}}), new String[][]{{"siblingIndex", "", "1"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-32739"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"000", "-"}, false, 2, new String[][]{}), new String[][]{{"attr", "java.lang.String", "3"}, {"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:6>"}, {"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!---->0 {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "-1.51"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "32769", "<sample:4>"}}), new String[][]{{"ownerDocument", "", "4"}, {"setBaseUri", "java.lang.String", "2"}, {"ownerDocument", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "16384", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "32734"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-62", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "33024"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:7>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "0", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"32767", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "32767", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"327/68"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:4>", "32713", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "#text32768"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "010"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "e", "a1.5e30"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "abcc"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "1.12345678901234567", "-0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"#tfxt"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-10", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
