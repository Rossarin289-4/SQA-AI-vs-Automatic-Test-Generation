package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "30721", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "1048528", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.Node", "siblingNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-54", "<sample:5>"}, {"org.jsoup.nodes.Node", "attr", "java.lang.String", "abs::"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32769", "<sample:0>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f30", "123456789012345678901234567890a"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "truenu"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "5"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "setSiblingIndex", "int", "1073741823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"28673", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "--1\t"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"html", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kery>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-27", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"noll\t"}, false, 0, null, 3), new String[][]{{"attributes", "", "2"}, {"put", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"H"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-108", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "-1"}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-23", "<sample:2>"}}, 1), new String[][]{{"childNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", "a,,c"}, false, 0, null, 2), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"32768-1", "01"}, false, 0, null, 1), new String[][]{{"previousSibling", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{".5"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483608", "<empty>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "32782", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"{"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "34752", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-32768"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "16384", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"put", "org.jsoup.nodes.Attribute", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\t"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Xy>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-257", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"nulk\t"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "0", "<sample:0>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<b:true>"}, {"org.jsoup.nodes.Node", "previousSibling", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"nu"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "1e1\u00e9"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 2), new String[][]{{"nextSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "-2147483648", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abbs:", "{.5"}, false, 0, null, 3), new String[][]{{"parent", "", "2"}, {"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "1"}, {"org.jsoup.nodes.Node", "previousSibling", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}}, 2), new String[][]{{"previousSibling", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-13", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, null, 3), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "="}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "65594", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1?2:30:45", "1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<sample:2>"}}, 2), new String[][]{{"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "10", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}, {"org.jsoup.nodes.Node", "childNode", "int", "16375"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"Hllo, Wosld"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.0234567", "{\"a\":0}"}, false, 0, null, 1), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.ccom/a?b=c+1", "1Ee5\u00e9"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "0", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("193240891", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"Hello+ World"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}, {"org.jsoup.nodes.Node", "attr", "java.lang.String", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"put", "org.jsoup.nodes.Attribute", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" sample=\"\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "null\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-54", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-1", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "327681.5e3001.12345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "I1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"h"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483590", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"32768", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "{"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"nu"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "1073741823", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-1", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "-.1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"true0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaabaaaaaaaaaaaaaaaaaaaaaaa", "1/123456788"}, false), new String[][]{{"nodeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "1"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-1073741824", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.1234577"}, false), new String[][]{{"siblingIndex", "", "5"}, {"childNodes", "", "1"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"{1.12345678m"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1..5fTITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"010"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"abs:"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "*1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083346", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "10", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}, {"org.jsoup.nodes.Node", "setSiblingIndex", "int", "1073741841"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}, {"org.jsoup.nodes.Node", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"123456789011345678901234567890"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-216", "<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:1>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"nulll\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "65422", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-216", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}}), new String[][]{{"dataset", "", "0"}, {"containsValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1073774591", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?", "{\""}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:10>"}}), new String[][]{{"outerHtml", "", "4"}, {"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",", "1.5c"}, false, 1, new String[][]{}), new String[][]{{"hasAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"TTitle"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}}), new String[][]{{"childNode", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.123456778"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}/a/b", "I1.5"}, false), new String[][]{{"nextSibling", "", "2"}, {"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"siblingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"asList", "", "1"}, {"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<d:3.0>"}}), new String[][]{{"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t\t", "PT1G"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}, {"org.jsoup.nodes.Node", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"mull\tTITLE"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "1LL"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"outerHtml", "", "1"}, {"nextSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", " x123456789"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE010", "a{c"}, false, 7, new String[][]{}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "1073741772", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083362", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"abcc.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"abbc"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073741823", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:aax>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"abc"}, false), new String[][]{{"outerHtml", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"2147583648I"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32769", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-32767"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "65586", "<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "1", "<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"--1Hello, World"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"attr", "java.lang.String", "2"}, {"parent", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("193240891", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900492", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "2020-0+-01", "<a>b}/a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-32768", "<sample:0>"}, {"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "abs:#text", "1.12d345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "1."}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "13", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-38", "<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:`>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aI>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-32749", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "1.12345678.5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample-->a\n <!--a--><!a> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"iterator", "", "0"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"abc.5"}, false, 4, new String[][]{}, 2), new String[][]{{"hasAttr", "java.lang.String", "3"}, {"parent", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"++1"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}, {"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483619", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "32732", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-54", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--><!a> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "a"}, {"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "H\rello,a World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "262142", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "1.1234567890123556"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-32769", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1773766752", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.25"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}), new String[][]{{"siblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}}), new String[][]{{"siblingNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:11>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"`,c,c"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "ab:"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-1073741823", "<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1.d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ".6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"21474836480x1F"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-2147483648", "<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "32769", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-304", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"PS1H"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-6", "<sample:3>"}, {"org.jsoup.nodes.Node", "outerHtml", ""}}, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "2130706431", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!---->a {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-27"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:2>", "<sample:9>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "Hello, Worldi"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "5", "<sample:2>"}, {"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083346", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--><!a> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900492", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--><!a> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}, {"org.jsoup.nodes.Node", "nextSibling", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}, {"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-268402689"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "baseUri", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "32768"}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-54"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 2, new String[][]{}), new String[][]{{"absUrl", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
