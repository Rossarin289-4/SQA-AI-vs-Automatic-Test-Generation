package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String"}, new String[]{"2E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5L"}, false, 6, new String[][]{}), new String[][]{{"splitText", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals("sample {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"i"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "coreValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"abc1.1234567"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "coreValue", "java.lang.String", "1.123456178"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[1.123456178]]> {getWholeText=1.123456178, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "wrap", new String[]{"java.lang.String"}, new String[]{"2020-0101"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "hasAttributes", ""}, {"org.jsoup.nodes.LeafNode", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147483647", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:3>", "<sample:10>"}, {"org.jsoup.nodes.LeafNode", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "org.jsoup.nodes.Node", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-0:-01a,b,c"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "unwrap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodesCopy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"/a/bTitle"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ownerDocument", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "filter", "org.jsoup.select.NodeFilter", "<sample:0>"}}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", "java.lang.Appendable", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNode", new String[]{"int"}, new String[]{"60"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "nextSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:8>", "<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.LeafNode", "parent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "shallowClone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"abc\t"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "setBaseUri", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "hasAttributes", ""}, {"org.jsoup.nodes.LeafNode", "attr", "java.lang.String", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"java.lang.String"}, new String[]{"5."}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "coreValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "filter", "org.jsoup.select.NodeFilter", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073741800", "<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"urue"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodes", ""}, {"org.jsoup.nodes.LeafNode", "attr", "java.lang.String,java.lang.String", "-1", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"-T"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "getOutputSettings", ""}}, 1), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "wrap", "java.lang.String", "1.51"}, {"org.jsoup.nodes.LeafNode", "outerHtml", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "traverse", "org.jsoup.select.NodeVisitor", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"0w023456789"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "org.jsoup.nodes.Node", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasParent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "removeAttr", "java.lang.String", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.123456789/1234567"}, false, 4, new String[][]{}, 2), new String[][]{{"previousSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "-2147483648"}}, 2), new String[][]{{"listIterator", "", "2"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "html", "java.lang.Appendable", "<sample:2>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"java.lang.String"}, new String[]{"010"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "absUrl", "java.lang.String", "--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "siblingNodes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2147483648", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "nextSibling", ""}, {"org.jsoup.nodes.LeafNode", "hasSameValue", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "shallowClone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"after", "org.jsoup.nodes.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "http://example.co1/a?b=c"}, false, 7, new String[][]{}, 3), new String[][]{{"parentNode", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", ""}}, 1), new String[][]{{"before", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "doSetBaseUri", "java.lang.String", "1.5Title1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", "java.lang.Appendable", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-32", "<empty>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "shallowClone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "TITLE"}, false, 6, new String[][]{}, 2), new String[][]{{"nextSibling", "", "6"}, {"after", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodelistChanged", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasParent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "wrap", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasAttr", new String[]{"java.lang.String"}, new String[]{"4."}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"HI"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-41", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-1073741824", "<sample:6>"}, {"org.jsoup.nodes.LeafNode", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "hasAttributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodelistChanged", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "siblingIndex", ""}, {"org.jsoup.nodes.LeafNode", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "before", new String[]{"java.lang.String"}, new String[]{"tr7ve"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483647", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "java.lang.String", "1.2345"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"java.lang.String"}, new String[]{"-1.4"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890112345671.5d", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "36", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-2147483648", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodesCopy", ""}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "2147483647", "<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"1cE.5"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "siblingNodes", ""}, {"org.jsoup.nodes.LeafNode", "attributes", ""}}), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "setBaseUri", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ensureChildNodes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "coreValue", new String[]{"java.lang.String"}, new String[]{"-6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[-6]]> {getWholeText=-6, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "coreValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "coreValue", new String[]{"java.lang.String"}, new String[]{"!"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[!]]> {getWholeText=!, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"get", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "-2147483648"}, {"org.jsoup.nodes.LeafNode", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-1073743872", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "absUrl", "java.lang.String", "2020-02-30T25:71:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setSiblingIndex", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:40>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "equals", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "root", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String", "["}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasAttr", new String[]{"java.lang.String"}, new String[]{"Titme"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483602", "<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "hasSameValue", "java.lang.Object", "<d:30.0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "root", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "java.lang.String", "a b"}, {"org.jsoup.nodes.LeafNode", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "shallowClone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "setSiblingIndex", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"attributes", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String"}, new String[]{"+13"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12456790123456"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.LeafNode", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodesCopy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4.5", "ra/b"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.LeafNode", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[0]]> {getWholeText=0, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "15"}}), new String[][]{{"clearAttributes", "", "3"}, {"isBlank", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "siblingIndex", ""}}), new String[][]{{"childNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"TiHle"}, false, 6, new String[][]{}), new String[][]{{"parentNode", "", "0"}, {"traverse", "org.jsoup.select.NodeVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"10", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "unwrap", ""}, {"org.jsoup.nodes.LeafNode", "toString", ""}}), new String[][]{{"siblingNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"n"}, false, 3, new String[][]{}), new String[][]{{"previousSibling", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodelistChanged", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String"}, new String[]{"Hello+ World"}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String,java.lang.String", "1:10", "2148"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "root", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false), new String[][]{{"parent", "", "3"}, {"replaceWith", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "10", "<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodelistChanged", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "absUrl", "java.lang.String", ".25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<empty>"}}), new String[][]{{"html", "java.lang.Appendable", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "[\t1,3]"}, false, 7, new String[][]{}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-02h-30T25:61:6"}, false, 5, new String[][]{}), new String[][]{{"hasParent", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "nodelistChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodeSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "clone", ""}}), new String[][]{{"nextSibling", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-37>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String,java.lang.String", "1e10", "000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ensureChildNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"removeIgnoreCase", "java.lang.String", "5"}, {"hasKeyIgnoreCase", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "baseUri", ""}}), new String[][]{{"hasKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-1", "<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setSiblingIndex", new String[]{"int"}, new String[]{"9"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"clearAttributes", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=true, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNode", new String[]{"int"}, new String[]{"-2147483556"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"5ML"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "5"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}), new String[][]{{"append", "char[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<![CDATA[0]]> a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "getOutputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "coreValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "parentNode", ""}, {"org.jsoup.nodes.LeafNode", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "getOutputSettings", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"syntax", "", "3"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isBlank", "", "6"}, {"html", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "coreValue", new String[]{"java.lang.String"}, new String[]{"--D"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[--D]]> {getWholeText=--D, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ensureChildNodes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "absUrl", "java.lang.String", "1.1234,67890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<![CDATA[0]]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "traverse", "org.jsoup.select.NodeVisitor", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "doSetBaseUri", "java.lang.String", "1"}, {"org.jsoup.nodes.LeafNode", "removeAttr", "java.lang.String", "12:30:445"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-1073741824", "<sample:5>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String"}, new String[]{"1.123456780x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", "java.lang.Appendable", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12345688"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "-2", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:610"}, false, 0, null, 2), new String[][]{{"shallowClone", "", "3"}, {"replaceWith", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ensureChildNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "html", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}}, 2), new String[][]{{"insert", "int,java.lang.Object", "3"}, {"insert", "int,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<ketruey![CDATA[]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #cdata=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<empty>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "root", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "before", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"root", "", "4"}, {"parent", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:0>"}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "java.lang.String", "2147483648-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"isBlank", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "nodeName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "1073741824", "<null>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nextSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "-41", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "clearAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "setSiblingIndex", "int", "2147483647"}}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"previousSibling", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.LeafNode", "absUrl", "java.lang.String", "110"}}), new String[][]{{"nodeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "-.1"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}}, 2), new String[][]{{"listIterator", "int", "2"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.LeafNode", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1e102E-5"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "clearAttributes", ""}}), new String[][]{{"siblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<d:-31.466>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "baseUri", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}), new String[][]{{"nodeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "ensureChildNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "java.lang.String", "\n1.1234567890121456"}, {"org.jsoup.nodes.LeafNode", "nodelistChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "before", new String[]{"java.lang.String"}, new String[]{" "}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "coreValue", "java.lang.String", "-1/5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 2), new String[][]{{"parentNode", "", "4"}, {"wrap", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "outerHtml", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.LeafNode", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "shallowClone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "root", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "wrap", "java.lang.String", "null"}}), new String[][]{{"ownerDocument", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{}, 3), new String[][]{{"nodeName", "", "0"}, {"childNode", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String,java.lang.String", "TTITLE", "PT1H9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "attr", "java.lang.String", "http://exampme.com/a?b=c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "hasParent", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "childNode", "int", "18"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "setBaseUri", "java.lang.String", "Tile"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"F\u00e9"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "absUrl", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<sample:1>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"true"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "after", "org.jsoup.nodes.Node", "<sample:4>"}}, 3), new String[][]{{"setBaseUri", "java.lang.String", "3"}, {"ownerDocument", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "removeAttr", new String[]{"java.lang.String"}, new String[]{"[1,1]"}, false), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "html", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.LeafNode", "traverse", "org.jsoup.select.NodeVisitor", "<sample:3>"}}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<![C5DATA[]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "before", "java.lang.String", "\u00ea"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "shallowClone", ""}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.nodes.LeafNode", "filter", "org.jsoup.select.NodeFilter", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.CDataNode", actual.getClass().getName());
  assertEquals("<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[sample]]> {getWholeText=sample, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "parent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "setBaseUri", new String[]{"java.lang.String"}, new String[]{".5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<![CDATA[]]> {getWholeText=, hasParent=false, isBlank=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "siblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.LeafNode", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]> {getWholeText=0, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.CDataNode", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-25", ""}, false, 0, new String[][]{{"org.jsoup.nodes.LeafNode", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#cdata", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]> {getWholeText=a, hasParent=false, isBlank=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
